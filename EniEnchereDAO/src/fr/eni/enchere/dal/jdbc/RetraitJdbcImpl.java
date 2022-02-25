package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.RetraitDAO;

public class RetraitJdbcImpl implements RetraitDAO{
	
	private static final String sqlInsert = "INSERT into RETRAITS(no_article,rue,code_postal,ville) VALUES(?,?,?,?)";
	
	
	
	
	public void insertRetrait(Retrait r) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		
		
		try {
			cnx=JdbcTools.getConnection();
			rqt=cnx.prepareStatement(sqlInsert);
			rqt.setInt(1,r.getNoArticle());
			rqt.setString(2,r.getRue());
			rqt.setString(3,r.getCode_postal());
			rqt.setString(4,r.getVille() );
			
			
			
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

	
	

}
