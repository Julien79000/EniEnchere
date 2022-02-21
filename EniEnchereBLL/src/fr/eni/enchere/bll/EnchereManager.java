package fr.eni.enchere.bll;

public class EnchereManager {
	private static EnchereManager instance;

	public static EnchereManager getInstance() {
		if(instance == null) {
			instance = new EnchereManager();
		}
		return instance;
	}
	private EnchereManager() {
		

	}

}
