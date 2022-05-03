package model.dao;

import connection.ConnectionDB;
import model.bean.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AlunoDAO {

	public void create(Aluno al) {

		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmtAl = null;
		PreparedStatement stmtPes = null;

		try {

			stmtAl = con.prepareStatement(
					"INSERT INTO sistemagestaoescola.pessoa (nome, dt_Nascimento, RG, CPF) VALUES (?,?, ?, ?);");
			stmtAl.setString(1, al.getNome());
			stmtAl.setString(2, al.getDt_Nascimento());
			stmtAl.setString(3, al.getRG());
			stmtAl.setString(4, al.getCPF());
			
			stmtPes = con.prepareStatement("INSERT INTO sistemagestaoescola.aluno  (nome_mae,nome_pai,cep,endereco,complemento,pessoa_Cd_Pessoa) VALUES (?,?,?,?,?,?);");
			stmtPes.setString(1, al.getNomeMae());
			stmtPes.setString(2, al.getNomePai());
			stmtPes.setString(3, al.getCep());
			stmtPes.setString(4, al.getEndereco());
			stmtPes.setString(5, al.getComplemento());
			stmtPes.setInt(6, 10);
			
			stmtAl.executeUpdate();
			stmtPes.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Salvo!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro!" + e);
			e.printStackTrace();
		} finally {
			ConnectionDB.closeConnection(con, stmtAl);
			ConnectionDB.closeConnection(con, stmtPes);
		}
	}
	
	
}