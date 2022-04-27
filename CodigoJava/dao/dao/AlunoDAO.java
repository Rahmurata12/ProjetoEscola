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
			
			stmt = con.prepareStatement("INSERT INTO sistemagestaoescola.aluno (nome,dt_Nascimento,RG,CPF,nome_mae,nome_pai,cep,endereco,complemento) VALUES(?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, al.getNome());
			stmt.setString(2, al.getDt_Nascimento());
			stmt.setString(3, al.getRG());
			stmt.setString(4, al.getCPF());
			stmt.setString(5, al.getNomeMae());
			stmt.setString(6, al.getNomePai());
			stmt.setString(7, al.getCep());
			stmt.setString(8, al.getEndereco());
			stmt.setString(9, al.getComplemento());
			
			
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