package fr.eni.enchere.dal;

import fr.eni.enchere.bo.Utilisateur;

public class UtilisateurTest {

	public static void main(String[] args) {
		
		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();
		
		//Instanciation du jeu d'essai 
				Utilisateur user1 = new Utilisateur("JOJO","Dominois", "Julien","julien@gmail.com", 123456721,"12 rue de ...", "94120","Niort","123456789", 860, 0);
				System.out.println("Ajout des utilisateurs... ");
				try {
					utilisateurDAO.insert(user1);
				} catch (DALException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Article ajouté  : " + user1.toString() );
				
				user1.setNom("SAKHER");
				
				
				try {
					utilisateurDAO.update(user1);
				} catch (DALException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Article modifié : " + user1.toString() );

				
			
					
	}
}
