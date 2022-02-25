package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.CategorieDAO;
import fr.eni.enchere.dal.DALException;

public class CategorieDAOJdbcImpl implements CategorieDAO {
	
	private static final String sqlSelectAll = "SELECT no_categorie,libelle" +
			" from CATEGORIES";

	@Override
	public List<Categorie> selectAll() throws DALException {
		Connection cnx=null;
		Statement rqt=null;
		ResultSet rs=null;
		List<Categorie> liste=new ArrayList<Categorie>();
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.createStatement();
			rs=rqt.executeQuery(sqlSelectAll);
			
			Categorie cat=null;
			while(rs.next()) {
				cat=new Categorie(rs.getInt("no_categorie"),
						rs.getString("libelle"));
					
				liste.add(cat);
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
