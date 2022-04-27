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
		PreparedStatement stmt = null;
		
		try {
			
			stmt = con.prepareStatement("INSERT INTO sistemagestaoescola.aluno (nome_mae,nome_pai,cep,endereco,complemento) VALUES(?,?,?,?,?)");
			stmt.setString(1, al.getNomeMae());
			stmt.setString(2, al.getNomePai());
			stmt.setString(3, al.getCep());
			stmt.setString(4, al.getEndereco());
			stmt.setString(5, al.getComplemento());
			
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
