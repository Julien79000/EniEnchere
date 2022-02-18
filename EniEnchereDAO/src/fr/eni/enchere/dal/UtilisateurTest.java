package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public class UtilisateurTest {

	public static void main(String[] args) {
		
		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();
		
		//Instanciation du jeu d'essai 
				Utilisateur user1 = new Utilisateur("JOJO","Dominois", "Julien","julien@gmail.com", 123456721,"12 rue de ...", "94120","Niort","123456789", 860, 0);
				System.out.println("Ajout des utilisateurs... ");
				try {
					
					//Ajout d'un utilisateur a la BDD
					utilisateurDAO.insertUser(user1);
					System.out.println("Article ajouté  : " + user1.toString() );
					
					
					//Modification du nom d'un utilisateur dans la BDD
					user1.setNom("SAKHER");
					
					utilisateurDAO.update(user1);
					System.out.println("Article modifié : " + user1.toString() );
				
					
					// Supression d'un utilisateur de la BDD
					
					utilisateurDAO.delete(12);
					
					
					//Selection de tous les utilisateurs dans la BDD
					
					List<Utilisateur> users = null;
					users = utilisateurDAO.selectAll();
					System.out.println("Sélection de tous les articles  : " + users.toString() );
				} catch (DALException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
				
				




				
			
			
					
	}
}
