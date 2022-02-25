package fr.eni.enchere.bll;

import fr.eni.enchere.bll.utils.EniEnchereConstantes;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.DAOFactory;

public class UtilisateurBLL {
	
	
	
	public boolean login(String username, String password) throws DALException {
		return DAOFactory.getUtilisateurDAO().login(username, password);
	}
	
	public EniEnchereReponse insertUser(Utilisateur user) {
		
		boolean succes=false;
		
		
		try {
			succes=DAOFactory.getUtilisateurDAO().insertUser(user);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EniEnchereReponse reponse=new EniEnchereReponse(EniEnchereConstantes.CODE_SUCCESS, "Inscription avec succés");
		
		
		if(!succes) {
			reponse=new EniEnchereReponse(EniEnchereConstantes.CODE_ERROR_TECH, "Impossible d'inserer un utilisateur");
		}
		
		
		return reponse;
		
	}
	
	public Utilisateur selectById(int id) {
		
		return DAOFactory.getUtilisateurDAO().selectById(id);
		
	}
	
    public Utilisateur selectByIdentifiant(String identifiant) {
		
		return DAOFactory.getUtilisateurDAO().selectByIdentifiant(identifiant);
		
	}
	public void update(Utilisateur data) {
		
		 try {
			DAOFactory.getUtilisateurDAO().update(data);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void delete(int id) {
		try {
			DAOFactory.getUtilisateurDAO().delete(id);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	


}
