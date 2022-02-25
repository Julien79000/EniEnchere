package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.ArticlesVendus;

public interface ArticleVenduDAO {
	
	public boolean insertArticleVendu(ArticlesVendus a) throws DALException;
	
	public ArticlesVendus selectById(int id);
	
	public ArticlesVendus selectByCategorie(int id);
	
	
	public List<ArticlesVendus> selectAll() throws DALException;
	


}
