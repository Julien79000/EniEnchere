package fr.eni.enchere.dal;

import fr.eni.enchere.bo.ArticlesVendus;

public interface ArticleVenduDAO {
	
	public boolean insertArticleVendu(ArticlesVendus a) throws DALException;

}
