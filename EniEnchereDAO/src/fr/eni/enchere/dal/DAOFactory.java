package fr.eni.enchere.dal;

public class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO()  {

		UtilisateurDAO utilisateurDAO=null;

		try {
			utilisateurDAO=(UtilisateurDAO ) Class.forName("fr.eni.enchere.dal.jdbc.UtilisateurDAOJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return utilisateurDAO; 
	}

	public static ArticleVenduDAO getArticleVenduDAO()  {
		
		ArticleVenduDAO articleVenduDAO=null;
		
		try {
			articleVenduDAO=(ArticleVenduDAO ) Class.forName("fr.eni.enchere.dal.jdbc.ArticlesVendusDAOJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleVenduDAO; 
	}
	
	public static CategorieDAO getCategorieDAO()  {
		CategorieDAO categorieDAO=null;
		try {
			categorieDAO=(CategorieDAO) Class.forName("fr.eni.enchere.dal.jdbc.CategorieDAOJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categorieDAO; 
	}
	
	
	public static RetraitDAO getRetraitDAO()  {
		RetraitDAO retraitDAO=null;
		try {
			retraitDAO=(RetraitDAO) Class.forName("fr.eni.enchere.dal.jdbc.RetraitJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retraitDAO; 
	}

}
