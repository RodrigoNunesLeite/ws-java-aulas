package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		// o DB.getConnection faz a conexao com o banco
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// conecta o banco
			conn = DB.getConnection();	
			
			// instanciando o statemente
			st = conn.createStatement();
			
			// executeQuery = espera receber uma string, que seria a query
			rs = st.executeQuery("select * from department");
			
			// next = percorre os dados
			// enquanto existir um próximo
			while(rs.next() ) {
				// usamos o get com o tipo do campo e entre () colocamos o nome do campo
				System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
