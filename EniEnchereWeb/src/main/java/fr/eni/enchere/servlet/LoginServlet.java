package fr.eni.enchere.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import fr.eni.enchere.bll.BLLFactory;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("/LoginPage.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String creerUnCompte=request.getParameter("creerUnCompte");
		String connexion=request.getParameter("connexion");
		
		String identifiant=request.getParameter("identifiant");
		String motDePasse=request.getParameter("motDePasse");

		if(creerUnCompte!=null) {
		
		response.sendRedirect(request.getContextPath()+"/Register");
		}
		
		boolean succes=false;
		if(connexion!=null) {
			
			try {
				
			succes=	BLLFactory.getInstance().getUtilisaterManager().login(identifiant, motDePasse);
			
			if (succes) {
				
				Utilisateur user=BLLFactory.getInstance().getUtilisaterManager().selectByIdentifiant(identifiant);
				
		        HttpSession session = request.getSession();
		        
		        session.setAttribute("user", user);
		        session.setAttribute("identifiant", identifiant);
		        
			    response.sendRedirect("HomeServlet");
			    
			}
			
			else {
			    response.sendRedirect("LoginServlet");
			}
			}
			
			catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 	
	}
}
