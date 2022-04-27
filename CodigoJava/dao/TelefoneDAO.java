package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionDB;
import model.bean.Telefone;

public class TelefoneDAO {

	public void create(Telefone tel) {

		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;

		try {

			stmt = con.prepareStatement(
					"INSERT INTO sistemagestaoescola.pessoa (tipo_Tel,numero) VALUES(?,?)");
			stmt.setString(1, tel.getTipo_Tel());
			stmt.setString(2, tel.getNumero());

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Salvo!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro!" + e);
			e.printStackTrace();
		} finally {
			ConnectionDB.closeConnection(con, stmt);
		}
	}

}
