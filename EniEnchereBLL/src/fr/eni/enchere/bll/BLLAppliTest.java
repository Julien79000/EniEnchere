package fr.eni.enchere.bll;

import fr.eni.enchere.bo.Utilisateur;

public class BLLAppliTest {

	public static void main(String[] args) {
		
		Utilisateur user1 = new Utilisateur("sousou","SOUSOU", "Cyril","julien@gmail.com", 123456721,"12 rue de ...", "94120","Niort","123456789", 860, 0);
		
		
		
		BLLFactory.getInstance().getUtilisaterManager().insertUser(user1);
		String message = "ok ca marche";

		
		System.out.println(message);

	}

}
