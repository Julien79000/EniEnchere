package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLFactory;
import fr.eni.enchere.bll.EniEnchereReponse;
import fr.eni.enchere.bll.utils.EniEnchereConstantes;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("/RegisterPage.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HashMap<String, String> liste = new HashMap<String, String>();
		String [] parametres= new String [] {"pseudo","nom","prenom","email","telephone","rue","codePostal","ville","motDePasse","creer","annuler"};
		
		
		for ( String param : parametres) {
			
			liste.put(param, request.getParameter(param));
			
		}
		
		
		
		
		Utilisateur user = new Utilisateur(-1,liste.get("pseudo"),
				liste.get("nom"),
				liste.get("prenom"),liste.get("email"),Integer.parseInt(liste.get("telephone")),liste.get("rue"),
				liste.get("codePostal"),liste.get("ville"),liste.get("motDePasse"),0,0			
				
				);
		 HttpSession session = request.getSession();
	        session.setAttribute("userProfil", user);
		
		
		EniEnchereReponse reponse = BLLFactory.getInstance().getUtilisaterManager().insertUser(user);
		
		
		if (reponse.getCodeResponse() == EniEnchereConstantes.CODE_SUCCESS) {
			// Redirection accceil
			response.sendRedirect("LoginServlet");
		}
		String annuler = null;
		if(annuler.equals(request.getParameter("annuler"))) {
			RequestDispatcher rd = null;
			rd = request.getRequestDispatcher("/LoginPage.jsp");
			rd.forward(request, response);			
		}
		else {
			// Error
			response.sendRedirect("Register");
		}
		
	
	}


	
}

