package fr.eni.enchere.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLFactory;
import fr.eni.enchere.bo.ArticlesVendus;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;

/**
 * Servlet implementation class ArticleAVendreServlet
 */
@WebServlet("/ArticleAVendreServlet")
public class ArticleAVendreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Utilisateur user= (Utilisateur) session.getAttribute("user");
		
		
	
		
	List<Categorie>listeCategories=null;
	
	try {
		listeCategories=BLLFactory.getInstance().getCategorieManager().selectAll();
	} catch (DALException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	request.setAttribute("rue", user.getRue());
	request.setAttribute("codePostal", user.getCodePostal());
	request.setAttribute("ville", user.getVille());

	request.setAttribute("listeCategories", listeCategories);
	
	
	
	RequestDispatcher rd = null;
	rd = request.getRequestDispatcher("/ArticleAVendre.jsp");
	rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		Utilisateur user= (Utilisateur) session.getAttribute("user");
		


		HashMap<String, String> liste = new HashMap<String, String>();
		String [] parametres= new String [] {"nomArticle","description","debut","fin","prixInitial","categorie","rue","codePostal","ville"};
		
		
		for ( String param : parametres) {
			
			liste.put(param, request.getParameter(param));
			
		}
		
		Categorie cat= new Categorie(Integer.parseInt(liste.get("categorie")));
		
		Retrait r=new Retrait(cat.getNoCategorie(),liste.get("rue"),liste.get("codePostal"),liste.get("ville"));

		
		
		
		
		ArticlesVendus art = new ArticlesVendus(liste.get("nomArticle"),
				liste.get("description"),
				LocalDate.parse(liste.get("debut")),LocalDate.parse(liste.get("fin")),Integer.parseInt(liste.get("prixInitial")),0,user,cat);
		
		try {
			BLLFactory.getInstance().getArticleVenduManager().insertArticleVendu(art);
			BLLFactory.getInstance().getRetraitManager().insertRetrait(r);

		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("AjoutArticle.jsp");
		rd.forward(request, response);
		
		
		
	}


}
