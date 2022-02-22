package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	//S�lectionner un utilisateur par son no_utilisateur
	public Utilisateur selectById(int id);
	
	
	//S�lectionner tous les utilisateurs
	public List<Utilisateur> selectAll() throws DALException;
	
	
	//Modifier les attributs d'un utilisateur connu en BD
		public void update(Utilisateur data) throws DALException;
		
		
		
		//Ins�rer un nouvel utilisateur
		public boolean insertUser(Utilisateur data) throws DALException;
		
		
		
		//Supprimer un utilisateur
		public void delete(int id) throws DALException;
		
		
		
		//S�lectionner les utilisateurs par code postal
		public List<Utilisateur> selectByMarque(String codePostal) throws DALException;
		
		
		
		//Se connecter
		public boolean login(String username, String password) throws DALException;
		
		public Utilisateur selectByIdentifiant(String identifiant);
		
		

	

		
		

	
	

}
