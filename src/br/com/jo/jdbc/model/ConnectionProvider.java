package br.com.jo.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/sandbox";
	private static final String USER = "postgres";
	private static final String PASSWORD = "password1";
	
	private static Connection connection;	
	
	public static Connection getConnection() throws SQLException{
		if(connection == null){
			//Check exception SQLException
			//Optei por usar o throws, para tratar isso em outro lugar, mas poderia circundar essa linha com try/catch
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		
		return connection;
	}

}
