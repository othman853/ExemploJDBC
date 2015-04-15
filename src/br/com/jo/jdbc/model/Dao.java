package br.com.jo.jdbc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//Responsavel pelas operacoes com banco de dados.
//Necessita de uma Connection para funcionar
public class Dao {
	
	private Connection connection;
	
	public Dao(Connection connection){
		this.connection = connection;
	}	
	
	public void save(String text) throws SQLException{		
		String sql = "INSERT INTO test_table (text) VALUES (?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, text);
		
		statement.execute();		
	}	
}