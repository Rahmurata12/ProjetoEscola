package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastroProfessor extends JFrame {

	private JPanel contentPane;

	// JLabel
		private JLabel Titulo = new JLabel("Cadastro de Alunos");
		private JLabel NomeLabel = new JLabel("Nome: ");
		private JLabel DataNascimentoLabel = new JLabel("Data de Nascimento: ");
		private JLabel RGLabel = new JLabel("RG: ");
		private JLabel CPFLabel = new JLabel("CPF: ");

		// JTextField
		private JTextField NomeTxtF = new JTextField();;
		private JTextField DataNascimentoTxtF = new JTextField();
		private JTextField RGTxtF = new JTextField();
		private JTextField CPFTxtF = new JTextField();

		// JButton
		private JButton BtnSalvar = new JButton("Salvar");
		private JButton BtnFechar = new JButton("Fechar");
		private final JLabel lblNewLabel = new JLabel("Telefone");
		private final JPanel panel_1_1 = new JPanel();
		private final JLabel lblDiciplina = new JLabel("Diciplina");
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessor frame = new CadastroProfessor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(633, 496);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);

		
		Titulo.setBounds(150, 20, 150, 15);
		NomeLabel.setBounds(50, 81, 40, 15);
		DataNascimentoLabel.setBounds(50, 120, 150, 15);
		RGLabel.setBounds(50, 160, 27, 15);
		CPFLabel.setBounds(50, 201, 34, 15);

		NomeTxtF.setBounds(96, 80, 150, 15);
		DataNascimentoTxtF.setBounds(177, 119, 137, 15);
		RGTxtF.setBounds(80, 159, 100, 15);
		CPFTxtF.setBounds(80, 200, 100, 15);

		BtnSalvar.setBounds(374, 380, 100, 50);
		BtnFechar.setBounds(484, 380, 100, 50);
		BtnFechar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		
		getContentPane().add(Titulo);
		getContentPane().add(NomeLabel);
		getContentPane().add(NomeTxtF);
		getContentPane().add(DataNascimentoLabel);
		getContentPane().add(DataNascimentoTxtF);
		getContentPane().add(RGLabel);
		getContentPane().add(RGTxtF);
		getContentPane().add(CPFLabel);
		getContentPane().add(CPFTxtF);
		getContentPane().add(BtnSalvar);
		getContentPane().add(BtnFechar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(413, 81, 137, 122);
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Foto");
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(388, 236, 150, 115);
		getContentPane().add(panel_1);
		
		panel_1.add(lblNewLabel);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(50, 275, 150, 115);
		
		getContentPane().add(panel_1_1);
		
		panel_1_1.add(lblDiciplina);
	}

}
