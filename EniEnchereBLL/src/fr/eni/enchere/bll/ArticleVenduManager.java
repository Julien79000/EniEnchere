package fr.eni.enchere.bll;

public class ArticleVenduManager {
	private static ArticleVenduManager instance;

	public static ArticleVenduManager getInstance() {
		if(instance == null) {
			instance = new ArticleVenduManager();
		}
		return instance;
	}
	
	private ArticleVenduManager() {
		
	}

}
