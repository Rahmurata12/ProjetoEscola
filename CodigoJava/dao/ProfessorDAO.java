package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionDB;
import model.bean.Professor;

public class ProfessorDAO {
	
	
public void create(Professor prof) {
		
		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;
		
		try {
			
			stmt = con.prepareStatement("INSERT INTO sistemagestaoescola.pessoa (nome,dt_Nascimento,RG,CPF) VALUES(?,?,?,?)");
			stmt.setString(1, prof.getNome());
			stmt.setString(2, prof.getDt_Nascimento());
			stmt.setString(3, prof.getRG());
			stmt.setString(4, prof.getCPF());
			
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