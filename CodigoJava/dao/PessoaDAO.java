package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionDB;
import model.bean.Pessoa;

public class PessoaDAO {
	
	
public void create(Pessoa ps) {
		
		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;
		
		try {
			
			stmt = con.prepareStatement("INSERT INTO sistemagestaoescola.pessoa (nome,dt_Nascimento,RG,CPF) VALUES(?,?,?,?)");
			stmt.setString(1, ps.getNome());
			stmt.setString(2, ps.getDt_Nascimento());
			stmt.setString(3, ps.getRG());
			stmt.setString(4, ps.getCPF());
			
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

