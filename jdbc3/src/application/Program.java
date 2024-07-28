package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import db.DB;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("21/06/1992", fmt);
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+"(?, ?, ?, ?, ?)"
					, Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Diego Brito");
			st.setString(2, "diego@teste.com");
			st.setDate(3, new java.sql.Date(java.sql.Date.valueOf(date).getTime()));
			st.setDouble(4, 1200.00);
			st.setInt(5, 2);
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println(id);
				}
				
				DB.closeResulset(rs);
			}else {
				System.out.println("NADA");
			}
			
			System.out.println(rowsAffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
