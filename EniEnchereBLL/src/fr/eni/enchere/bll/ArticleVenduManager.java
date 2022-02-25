package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.ArticlesVendus;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.DAOFactory;

public class ArticleVenduManager {
	public boolean insertArticleVendu(ArticlesVendus a) throws DALException {
		return DAOFactory.getArticleVenduDAO().insertArticleVendu(a);
	}
	
	public ArticlesVendus selectById(int id) {
		return DAOFactory.getArticleVenduDAO().selectById(id);
	}
	
	public ArticlesVendus selectByCategorie(int id) {
		return DAOFactory.getArticleVenduDAO().selectByCategorie(id);
	}
	
	
	public List<ArticlesVendus> selectAll() throws DALException {
		return DAOFactory.getArticleVenduDAO().selectAll();
	}
		
	public ArticleVenduManager() {
		
	}



