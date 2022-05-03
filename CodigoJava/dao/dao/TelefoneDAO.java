package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import connection.ConnectionDB;
import model.bean.Telefone;

public class TelefoneDAO {

	public void create(Telefone tel) {

		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;

		try {

			stmt = con.prepareStatement(
					"INSERT INTO sistemagestaoescola.telefone (tipo_Tel,numero,pessoa_Cd_Pessoa) VALUES(?,?,?)");
			stmt.setString(1, tel.getTipoTel());
			stmt.setString(2, tel.getNumero());
			stmt.setInt(3, 10);

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Salvo!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro!" + e);
			e.printStackTrace();
		} finally {
			ConnectionDB.closeConnection(con, stmt);
		}
	}
	
	public ArrayList<Telefone> listar() {

		ArrayList<Telefone> tel = new ArrayList<>();

		try {
			Connection con = ConnectionDB.getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement(
					"SELECT * FROM aulas.materias_professores");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String tipoTel = rs.getString(2);
				String numero = rs.getString(3);

				tel.add(new Telefone(id, tipoTel, numero));
			}
			con.close();
			return tel;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void delete(int id) {

		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;

		try {

			stmt = con.prepareStatement(
					"DELETE FROM sistemagestaoescola.telefone WHERE id = ?");
			stmt.setInt(1, id);

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Excluido!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro!" + e);
			e.printStackTrace();
		} finally {
			ConnectionDB.closeConnection(con, stmt);
		}
	}
	
}