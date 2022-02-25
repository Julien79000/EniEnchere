package fr.eni.enchere.dal;

import java.sql.Date;

public class Outils {
	
	public Outils() {
	};

	public Date dateSQLEnJavaUtil(java.sql.Date dateSQL) {
		Date date = (Date) new java.util.Date(dateSQL.getTime());
		return date;
	}

	public java.sql.Date dateJavaUtilEnDateSQL(java.util.Date date) {
		java.sql.Date dateSQL = new java.sql.Date(date.getTime());
		return dateSQL;
	}

}
