package br.com.jo.jdbc.app;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.jo.jdbc.model.ConnectionProvider;
import br.com.jo.jdbc.model.Dao;

//Aqui todas as excecoes lancadas pelos metodos com throws serao tratadas 
public class Main {
	
	public static void main(String[] args) {
		Connection connection;
		try {
			//Pode lancar uma SQLException
			connection = ConnectionProvider.getConnection();
			Dao dao = new Dao(connection);
			
			String text = "Hello again JDBC";
			
			//Tambem pode lancar uma SQLException
			dao.save(text);			
			
		} catch (SQLException e) {
			//As duas possiveis SQLExceptions a serem lancadas serao tratadas aqui, simplesmente mostraremos o erro no console.
			System.out.println(e.getMessage());
			
			//O stack trace e importante para quem desenvolve, para saber onde o erro ocorreu, sempre use esse metodo. :p
			e.printStackTrace();
		}
		
	}

}
