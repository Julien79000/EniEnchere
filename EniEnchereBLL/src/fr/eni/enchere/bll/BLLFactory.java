package fr.eni.enchere.bll;

public class BLLFactory {
	
private static BLLFactory instance;
	
	private UtilisateurBLL utilisateurManager;
	private CategorieManager categorieManager;
	private ArticleVenduManager articleVenduManager;
	private RetraitManager retraitManager;



	
	public static BLLFactory getInstance() {
		if (instance == null) {
			instance = new BLLFactory();
		}
		
		return instance;
	}

	public UtilisateurBLL getUtilisaterManager() {
		if (utilisateurManager == null) {
			utilisateurManager = new UtilisateurBLL();
		}
		return utilisateurManager;
	}
	
	public CategorieManager getCategorieManager() {
		if (categorieManager == null) {
			categorieManager = new CategorieManager();
		}
		return categorieManager;
	}
	
	public ArticleVenduManager getArticleVenduManager() {
		if (articleVenduManager == null) {
			articleVenduManager = new ArticleVenduManager();
		}
		return articleVenduManager;
	}
	public RetraitManager getRetraitManager() {
		if (retraitManager == null) {
			retraitManager = new RetraitManager();
		}
		return retraitManager;
	}


}
