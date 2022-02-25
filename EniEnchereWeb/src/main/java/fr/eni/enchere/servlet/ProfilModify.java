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
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class ProfilModify
 */
@WebServlet("/ProfilModify")
public class ProfilModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilModify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		String id=(String) session.getAttribute("identifiant");
		
		Utilisateur user =BLLFactory.getInstance().getUtilisaterManager().selectByIdentifiant(id);
		
		request.setAttribute("user", user);
		
		getServletContext().getRequestDispatcher("/Profil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String retour=request.getParameter("retour");
		String enregistrer=request.getParameter("enregistrer");
		String supprimer=request.getParameter("supprimer");
		
		HttpSession session = request.getSession();
		
		Utilisateur user= BLLFactory.getInstance().getUtilisaterManager().selectByIdentifiant((String) session.getAttribute("identifiant"));
		
		String choix="";
		
		if(choix.equals(retour)) {
			response.sendRedirect("HomeServlet");
		}
		
		if(choix.equals(enregistrer)) {
	
			HashMap<String, String> liste = new HashMap<String, String>();
			String [] parametres= new String [] {"pseudo","nom","prenom","email","telephone","rue","codePostal","ville","motDePasse"};
			
			for (String param : parametres) {
				liste.put(param, request.getParameter(param));
			}
			
			user.setPseudo(liste.get("pseudo"));
			user.setPrenom(liste.get("prenom"));
			user.setNom(liste.get("nom"));
			user.setEmail(liste.get("email"));
			user.setTelephone(Integer.parseInt(liste.get("telephone")));
			user.setRue(liste.get("rue"));
			user.setCodePostal(liste.get("codePostal"));
			user.setVille(liste.get("ville"));
			user.setMotDePasse(liste.get("motDePasse"));

			
	        session.setAttribute("user", user);
			
			BLLFactory.getInstance().getUtilisaterManager().update(user);
			response.sendRedirect("HomeServlet");
	
		}
	
		if(choix.equals(supprimer)) {
			response.sendRedirect("DeleteUserServlet");
		}
	
	}

}
