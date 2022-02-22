package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import fr.eni.enchere.bo.ArticlesVendus;
import fr.eni.enchere.dal.ArticleVenduDAO;
import fr.eni.enchere.dal.DALException;

public class ArticlesVendusDAOJdbcImpl implements ArticleVenduDAO {
	
	private static final String sqlInsert = "INSERT into ARTICLES_VENDUS(nom_article,description,date_debut,date_fin,prix_initial,prix_vente,no_utilisateur,no_categorie) VALUES(?,?,?,?,?,?,?,?)";

	
	
	
	public boolean insertArticleVendu(ArticlesVendus a) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		boolean success = false;
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-DD",new Locale("EN"));
		Date uneDate=new Date();
		
		String maDateEnString=simpleDateFormat.format(uneDate);
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlInsert,Statement.RETURN_GENERATED_KEYS);
			rqt.setString(1, a.getNomArticle());
			rqt.setString(2,a.getDescription());
			rqt.setString(3, simpleDateFormat.format(a.getDateDebutEmbauche()));
			rqt.setString(4, simpleDateFormat.format(a.getDateFinEmbauche()));
			rqt.setInt(5, a.getMiseAPrix());
			rqt.setInt(6,a.getPrixVente());
			rqt.setInt(7,a.getUtilisateur().getNoUtilisateur());
			rqt.setInt(8,a.getCategorie().getNoCategorie());
			
			
			int nbRows = rqt.executeUpdate();
			if(nbRows == 1){
				ResultSet rs = rqt.getGeneratedKeys();
				if(rs.next()){
					a.setNoArticle(rs.getInt(1));
				}
				success=true;

			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				throw new DALException("close failed - ", e);
			}

		}
		return success;
		
		
		
	}

}
