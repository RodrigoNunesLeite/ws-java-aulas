package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program2 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();

			/*
			 * prepareStatement = espera uma string que vai ser meu comando sql
			 */
			st = conn.prepareStatement(
					"INSERT INTO seller " 
				  + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
				  + "VALUES " 
				  + "(?, ?, ?, ?, ?)", 
				  Statement.RETURN_GENERATED_KEYS);
			/*
			 * st.setString(1, "Carl Purple") = indica que vou trocar o primeiro
			 * interrogação, pela string Carl Purple
			 * 
			 * para o jdbc precisamos usar o new java.sql.Date
			 */
			st.setString(1, "Nunes2");
			st.setString(2, "nunes2@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.00);
			st.setInt(5, 4);

			// executando o comando
			/*
			 * executeUpdate = usamos para uma operação que retorna os dados, o retorno
			 * dessa operação é o número de linhas que foram alteradas
			 */

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
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			// sempre fechamos a conexão por último
			DB.closeConnection();
		}
	}

}
