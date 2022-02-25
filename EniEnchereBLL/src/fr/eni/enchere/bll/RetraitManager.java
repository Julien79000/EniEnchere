package fr.eni.enchere.bll;

import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.DAOFactory;

public class RetraitManager {
	

	public void insertRetrait(Retrait r) throws DALException {
		
		DAOFactory.getRetraitDAO().insertRetrait(r);
	}


}
