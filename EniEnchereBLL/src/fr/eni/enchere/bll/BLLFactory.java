package fr.eni.enchere.bll;

public class BLLFactory {
	
private static BLLFactory instance;
	
	private UtilisateurBLL utilisateurManager;
	
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

}
