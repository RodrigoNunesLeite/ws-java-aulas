package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		// o DB.getConnection faz a conexao com o banco
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
	}

}
