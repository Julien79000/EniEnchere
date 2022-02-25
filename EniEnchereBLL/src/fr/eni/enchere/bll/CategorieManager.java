package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.DAOFactory;

public class CategorieManager {
	
	public List<Categorie> selectAll() throws DALException {
		return DAOFactory.getCategorieDAO().selectAll();
	}

	
}
