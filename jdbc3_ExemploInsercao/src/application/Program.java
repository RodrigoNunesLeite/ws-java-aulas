package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();

			/*
			 * prepareStatement = espera uma string que vai ser meu comando sql
			 */
			
			/* Um único comando adicionando 2 departamentos
			 * */
			st = conn.prepareStatement(
					"insert into department (name) values ('D1'),('D2')",
					Statement.RETURN_GENERATED_KEYS);
			
			int rowsAffected = st.executeUpdate();

			// System.out.println("Done! Rows affected: " + rowsAffected);
			if (rowsAffected > 0) {
				// st.getGeneratedKeys() = retorna um objeto do tipo ResultSet, com 1 ou mais valores
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					/* 1 = para indicar que quero a primeira coluna,
					* como o ResultSet retorna uma tabela, posso pegar a primeira
					* coluna
					*/
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			} else {
				System.out.println("No rown affected!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			// sempre fechamos a conexão por último
			DB.closeConnection();
		}
	}

}
