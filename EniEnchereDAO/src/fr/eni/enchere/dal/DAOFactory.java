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
	
	
	
	
	
	

}
