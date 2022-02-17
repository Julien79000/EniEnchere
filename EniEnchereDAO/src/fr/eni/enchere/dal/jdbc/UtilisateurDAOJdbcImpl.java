package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.UtilisateurDAO;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {
	
	private static final String sqlInsert = "INSERT into utilisateurs(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String sqlUpdate = "UPDATE utilisateurs set pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,code_postal=?,ville=?,mot_de_passe=?,credit=?,administrateur=? where no_utilisateur=?";
	
	
	
	
	
	
	
	public Utilisateur selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Utilisateur> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
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
	public void insert(Utilisateur data) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		
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
		
		
		
	}
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub
		
	}
	public List<Utilisateur> selectByMarque(String codePostal) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	

}
