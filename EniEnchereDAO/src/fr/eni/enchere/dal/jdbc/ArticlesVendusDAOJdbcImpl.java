package fr.eni.enchere.dal.jdbc;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;



import fr.eni.enchere.bo.ArticlesVendus;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.ArticleVenduDAO;
import fr.eni.enchere.dal.DALException;



public class ArticlesVendusDAOJdbcImpl implements ArticleVenduDAO {
	
	private static final String sqlInsert = "INSERT into ARTICLES_VENDUS(nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) VALUES(?,?,?,?,?,?,?,?)";
	
	private static final String sqlSelectById = "SELECT * from ARTICLES_VENDUS INNER JOIN UTILISATEURS ON (ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur) INNER JOIN CATEGORIES ON (ARTICLES_VENDUS.no_categorie = CATEGORIES.no_categorie) WHERE ARTICLES_VENDUS.no_article = ?";
	private static final String sqlSelectByCategorie = "SELECT * from ARTICLES_VENDUS INNER JOIN UTILISATEURS ON (ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur) INNER JOIN CATEGORIES ON (ARTICLES_VENDUS.no_categorie = CATEGORIES.no_categorie) WHERE ARTICLES_VENDUS.no_categorie = ?";
	private static final String sqlSelectAll="SELECT * from ARTICLES_VENDUS INNER JOIN UTILISATEURS ON (ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur) INNER JOIN CATEGORIES ON (ARTICLES_VENDUS.no_categorie = CATEGORIES.no_categorie)";
	
	
	
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
			rqt.setDate(3, java.sql.Date.valueOf(a.getDateDebutEmbauche()));
			rqt.setDate(4,java.sql.Date.valueOf(a.getDateFinEmbauche()) );
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
	
	public ArticlesVendus selectById(int id) {
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		ArticlesVendus art=null;
		Utilisateur u= null;
		Categorie c=null;
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlSelectById);
			rqt.setInt(1, id);
			
			rs=rqt.executeQuery();
			if(rs.next()) {
				art=new ArticlesVendus(rs.getInt("no_article"),
						rs.getString("[nom_article"),
						rs.getString("description"),
						rs.getDate("date_debut_enchere").toLocalDate(),
						rs.getDate("date_fin_encheres").toLocalDate(),
						rs.getInt("prix_initial"),
						rs.getInt("prix_vente"));
						
				// creer un user
				u =new Utilisateur(rs.getInt("no_utilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getInt("telephone"),
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville"),
						rs.getString("mot_de_passe"),
						rs.getInt("credit"),
						rs.getInt("administrateur"));
				
				// creer un user
				c =new Categorie(rs.getInt("no_categorie"),
						rs.getString("libelle"));
				
				// asscoiations
				art.setUtilisateur(u);
				art.setCategorie(c);
				
				
		}
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		return art;
	
		
	}
	
	
	public ArticlesVendus selectByCategorie(int id) {
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		ArticlesVendus art=null;
		Utilisateur u= null;
		Categorie c=null;
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlSelectByCategorie);
			rqt.setInt(1, id);
			
			rs=rqt.executeQuery();
			if(rs.next()) {
				art=new ArticlesVendus(rs.getInt("no_article"),
						rs.getString("[nom_article"),
						rs.getString("description"),
						rs.getDate("date_debut_enchere").toLocalDate(),
						rs.getDate("date_fin_encheres").toLocalDate(),
						rs.getInt("prix_initial"),
						rs.getInt("prix_vente"));
						
				// creer un user
				u =new Utilisateur(rs.getInt("no_utilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getInt("telephone"),
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville"),
						rs.getString("mot_de_passe"),
						rs.getInt("credit"),
						rs.getInt("administrateur"));
				
				// creer un user
				c =new Categorie(rs.getInt("no_categorie"),
						rs.getString("libelle"));
				
				// asscoiations
				art.setUtilisateur(u);
				art.setCategorie(c);
				
				
		}
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		return art;
	
		
	}
	
	public List<ArticlesVendus> selectAll() throws DALException {
		Connection cnx=null;
		Statement rqt=null;
		ResultSet rs=null;
		Utilisateur u= null;
		Categorie c=null;
		List<ArticlesVendus> liste=new ArrayList<ArticlesVendus>();
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.createStatement();
			rs=rqt.executeQuery(sqlSelectAll);
			
			ArticlesVendus art=null;
			while(rs.next()) {
				art=new ArticlesVendus(rs.getInt("no_article"),
						rs.getString("nom_article"),
						rs.getString("description"),
						rs.getDate("date_debut_encheres").toLocalDate(),
						rs.getDate("date_fin_encheres").toLocalDate(),
						rs.getInt("prix_initial"),
						rs.getInt("prix_vente"));
						
				// creer un user
				u =new Utilisateur(rs.getInt("no_utilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getInt("telephone"),
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville"),
						rs.getString("mot_de_passe"),
						rs.getInt("credit"),
						rs.getInt("administrateur"));
				
				// creer un user
				c =new Categorie(rs.getInt("no_categorie"),
						rs.getString("libelle"));
				
				// asscoiations
				art.setUtilisateur(u);
				art.setCategorie(c);
				liste.add(art);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return liste;
	}
	
	
		
	
	
	



}