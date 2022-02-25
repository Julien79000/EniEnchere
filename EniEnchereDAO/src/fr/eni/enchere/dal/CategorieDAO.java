package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.ArticlesVendus;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;

public interface CategorieDAO {
	
	public List<Categorie> selectAll() throws DALException;
	

	
	

}
