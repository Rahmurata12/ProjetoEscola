package model.dao;

import connection.ConnectionDB;
import model.bean.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AlunoDAO {

	public void create(Aluno al) {

		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmtAl = null;
		PreparedStatement stmtPes = null;

		try {

			stmtPes = con.prepareStatement(
					"INSERT INTO sistemagestaoescola.pessoa (nome, dt_Nascimento, RG, CPF) VALUES (?,?, ?, ?);");
			stmtPes.setString(1, al.getNome());
			stmtPes.setString(2, al.getDt_Nascimento());
			stmtPes.setString(3, al.getRG());
			stmtPes.setString(4, al.getCPF());
			
			stmtAl = con.prepareStatement("INSERT INTO sistemagestaoescola.aluno  (nome_mae,nome_pai,cep,endereco,complemento,pessoa_Cd_Pessoa) VALUES (?,?,?,?,?, @UltimoID);");
			stmtAl.setString(1, al.getNomeMae());
			stmtAl.setString(2, al.getNomePai());
			stmtAl.setString(3, al.getCep());
			stmtAl.setString(4, al.getEndereco());
			stmtAl.setString(5, al.getComplemento());
			
			
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
	
	public boolean delete(int cd_Pessoa, int cd_Aluno) {
		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmtAl = null;
		PreparedStatement stmtPes = null;
		
		try {
			stmtPes = con.prepareStatement("delete FROM sistemagestaoescola.pessoa where Cd_Pessoa=?");
			stmtPes.setInt(1, cd_Pessoa);
			
			stmtAl = con.prepareStatement("delete FROM sistemagestaoescola.aluno where pessoa_Cd_Pessoa=?");
			stmtAl.setInt(1, cd_Aluno);
			
			stmtAl.executeUpdate();
			stmtPes.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro!" + e);
			e.printStackTrace();
			return false;
		} finally {
			ConnectionDB.closeConnection(con, stmtAl);
			ConnectionDB.closeConnection(con, stmtPes);
		}
		return true;
	}
	
	public Aluno read(int id) {
		
		Aluno al = new Aluno();
		
		try {
			Connection con = ConnectionDB.getConnection();
			PreparedStatement stmtAl = null;
			PreparedStatement stmtPes = null;
			
			ResultSet rsAl = stmtAl.executeQuery();
			ResultSet rsPes = stmtPes.executeQuery();
			
			stmtAl = con.prepareStatement("select *  FROM sistemagestaoescola.aluno where pessoa_Cd_Pessoa=?");
			stmtAl.setInt(1, id);
			
			stmtPes = con.prepareStatement("select * FROM sistemagestaoescola.pessoa where Cd_Pessoa=?");
			stmtPes.setInt(1, id);
			
			while (rsPes.next()) {
				al.setCd_Pessoa(rsPes.getInt(1));
				al.setNome(rsPes.getString(2));
				al.setDt_Nascimento(rsPes.getString(3));
				al.setRG(rsPes.getString(4));
				al.setCPF(rsPes.getString(5));
			}
			
			while(rsAl.next()) {
				al.setCd_Al(rsAl.getInt(1));
				al.setNomeMae(rsAl.getString(2));
				al.setNomePai(rsAl.getString(3));
				al.setCep(rsAl.getString(4));
				al.setEndereco(rsAl.getString(5));
				al.setComplemento(rsAl.getString(6));
				al.setCd_Al_Pessoa(rsAl.getInt(7));
			}
			con.close();
			return al;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}