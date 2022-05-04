package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionDB;
import model.bean.Pessoa;

public class PessoaDAO {

	public void create(Pessoa pes) throws SQLException {

		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;

			stmt = con.prepareStatement(
					"INSERT INTO sistemagestaoescola.pessoa (nome, dt_Nascimento, RG, CPF) VALUES (?,?, ?, ?);");
			stmt.setString(1, pes.getNome());
			stmt.setString(2, pes.getDt_Nascimento());
			stmt.setString(3, pes.getRG());
			stmt.setString(4, pes.getCPF());

			stmt.execute();
			JOptionPane.showMessageDialog(null, "Salvo!");
			ConnectionDB.closeConnection(con, stmt);
	}
}