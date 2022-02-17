package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.eni.enchere.dal.Settings;




public class JdbcTools {

	
	private static  String urldb;
	private static String userdb;
	private static String passworddb;
	
	static {
		
		try {
			Class.forName(Settings.getProperty("driverjdbc"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		urldb = Settings.getProperty("url");
		userdb = Settings.getProperty("user");
		passworddb = Settings.getProperty("password");
		System.out.println("urldb="+urldb+";userdb="+userdb+";passworddb="+passworddb);
	}
	
	
	
	public static Connection getConnection() throws SQLException{
		String url = String.format("%s;user=%s;password=%s;encrypt=true;trustServerCertificate=true", urldb, userdb, passworddb);  
		Connection cnx = DriverManager.getConnection(url);
		
		return cnx;
	}
	


}

