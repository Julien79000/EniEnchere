package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.UtilisateurDAO;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {
	
	private static final String sqlInsert = "INSERT into utilisateurs(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String sqlUpdate = "UPDATE utilisateurs set pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,code_postal=?,ville=?,mot_de_passe=?,credit=?,administrateur=? where no_utilisateur=?";
	private static final String sqlSelectById = "SELECT no_utilisateur, pseudo, nom,prenom, email, telephone, rue, code_postal, ville, mot_de_passe,credit,administrateur " +
			" from utilisateurs WHERE no_utilisateur = ?";
	private static final String sqlSelectAll = "SELECT no_utilisateur, pseudo, nom,prenom, email, telephone, rue, code_postal, ville, mot_de_passe,credit,administrateur " +
			" from utilisateurs";
	private static final String sqlSelectByLogin = "select no_utilisateur, pseudo, nom, prenom, email" +
			" from UTILISATEURS where email = ? AND mot_de_passe = ?";
	private static final String sqlDelete = "DELETE from utilisateurs where no_utilisateur=?";

	
	
	
	public boolean insertUser(Utilisateur data) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		boolean success = false;

		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlInsert,Statement.RETURN_GENERATED_KEYS);
			rqt.setString(1, data.getPseudo());
			rqt.setString(2, data.getNom());
			rqt.setString(3, data.getPrenom());
			rqt.setString(4, data.getEmail());
			rqt.setInt(5, data.getTelephone());
			rqt.setString(6,data.getRue());
			rqt.setString(7,data.getCodePostal());
			rqt.setString(8,data.getVille());
			rqt.setString(9,data.getMotDePasse());
			rqt.setInt(10, data.getCredit());
			rqt.setInt(11,data.getAdministrateur());
			
			int nbRows = rqt.executeUpdate();
			if(nbRows == 1){
				ResultSet rs = rqt.getGeneratedKeys();
				if(rs.next()){
					data.setNoUtilisateur(rs.getInt(1));
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
	
	@Override
	public boolean login(String username, String password) throws DALException {
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs = null;
		Utilisateur user = null;
		boolean success = false;
		
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlSelectByLogin);
			rqt.setString(1, username);
			rqt.setString(2, password);
			
			if(rs.next()) {
				
				success=true;
				
			}	
			
		} catch (SQLException e) {
			throw new DALException("selectById failed - id" , e);
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
		
		return success;
	}
	
	
	public Utilisateur selectById(int id) {
		Connection cnx=null;
		PreparedStatement rqt=null;
		ResultSet rs=null;
		Utilisateur user=null;
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlSelectById);
			rqt.setInt(1, id);
			
			rs=rqt.executeQuery();
			if(rs.next()) {
				user=new Utilisateur(rs.getInt("no_utilisateur"),
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
				e.printStackTrace();
			}

		}
		
		return user;
	}
	
	public void update(Utilisateur data) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlUpdate);
			rqt.setString(1, data.getPseudo());
			rqt.setString(2, data.getNom());
			rqt.setString(3, data.getPrenom());
			rqt.setString(4, data.getEmail());
			rqt.setInt(5, data.getTelephone());
			rqt.setString(6,data.getRue());
			rqt.setString(7,data.getCodePostal());
			rqt.setString(8,data.getVille());
			rqt.setString(9,data.getMotDePasse());
			rqt.setInt(10, data.getCredit());
			rqt.setInt(11,data.getAdministrateur());
			rqt.setInt(12,data.getNoUtilisateur());

			
			rqt.executeUpdate();
			
				
			
		
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
		
	}

	public void delete(int id) throws DALException {
		Connection cnx=null;
		PreparedStatement rqt=null;		
		
		try {
			cnx=JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlDelete);
			rqt.setInt(1, id);
			rqt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				throw new DALException("close failed " , e);
			}

		}		
		
		
	}
	public List<Utilisateur> selectByMarque(String codePostal) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> selectAll() throws DALException {
		Connection cnx=null;
		Statement rqt=null;
		ResultSet rs=null;
		List<Utilisateur> liste=new ArrayList<Utilisateur>();
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.createStatement();
			rs=rqt.executeQuery(sqlSelectAll);
			
			Utilisateur user=null;
			while(rs.next()) {
				user=new Utilisateur(rs.getInt("no_utilisateur"),
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
				liste.add(user);
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
