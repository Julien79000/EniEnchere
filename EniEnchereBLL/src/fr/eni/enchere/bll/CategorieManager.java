package fr.eni.enchere.bll;

public class CategorieManager {
	private static CategorieManager instance;

	public static CategorieManager getInstance() {
		if(instance == null) {
			instance = new CategorieManager();
		}
		return instance;
	}
	private CategorieManager() {
		

	}
}
