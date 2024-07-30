package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import exceptions.DBIntegrityException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"DELETE FROM department "
					+"WHERE "
					+"id = ?");
			st.setInt(1, 2);
			int rowsAffected = st.executeUpdate();
			
			System.out.println(rowsAffected);
			
		} catch (SQLException e) {
			throw new DBIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
