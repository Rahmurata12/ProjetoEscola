package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionDB;

public class cdPessoaDAO {

	private boolean update(int id) {

		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"UPDATE `sistemagestaoescola`.`cd_pessoa` SET `cd_Pessoa` = '?' WHERE (`cd_Pessoa` = '1');");
			stmt.setInt(1, id);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return true;
	}
	
	private int select() {
		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;
		
		int id = 0;
		try {
			stmt = con.prepareStatement("SELECT * FROM sistemagestaoescola.cd_Pessoa");
			ResultSet rs = stmt.executeQuery();
			id = rs.getInt(1);
			stmt.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return id;
	}
	
	public int CriarId() {
		
		int id = 0;
		
		try {
			id = select() + 1;
			update(id);
		} catch (Exception e) {
			id = -1;
			e.printStackTrace();
		}
		return id;
	}
	
}
