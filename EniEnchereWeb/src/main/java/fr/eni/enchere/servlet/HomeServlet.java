package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import fr.eni.enchere.bll.BLLFactory;
import fr.eni.enchere.bo.ArticlesVendus;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.dal.DALException;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ArticlesVendus> articlesList =null;
		
		try {
			articlesList=BLLFactory.getInstance().getArticleVenduManager().selectAll();

		} catch (DALException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		request.setAttribute("articlesList", articlesList);
		
		
		List<Categorie>listeCategories=null;
		
		try {
			listeCategories=BLLFactory.getInstance().getCategorieManager().selectAll();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		request.setAttribute("listeCategories", listeCategories);
		
		
	
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int categorie=Integer.parseInt(request.getParameter("categorie"));
		
		ArticlesVendus art=BLLFactory.getInstance().getArticleVenduManager().selectByCategorie(categorie);
		
		request.setAttribute("article", art);
		
	}

}
