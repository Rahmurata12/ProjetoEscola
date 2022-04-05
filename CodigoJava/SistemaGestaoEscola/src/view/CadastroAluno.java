package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class CadastroAluno extends JFrame {

	// JPanel
	private JPanel Main = new JPanel();

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
	private JTextField textField;
	private JTextField textField_1;
	private final JLabel lblCep = new JLabel("CEP: ");
	private final JLabel lblCom = new JLabel("Endere\u00E7o: ");
	private JTextField textField_2;
	private JTextField textField_3;
	private final JTextField textField_4 = new JTextField();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(633, 496);
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

		JLabel lblNewLabel = new JLabel("Nome M\u00E3e: ");
		lblNewLabel.setBounds(50, 242, 77, 14);
		getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(119, 241, 100, 15);
		getContentPane().add(textField);

		JLabel lblNomePai = new JLabel("Nome Pai: ");
		lblNomePai.setBounds(50, 281, 68, 14);
		getContentPane().add(lblNomePai);

		textField_1 = new JTextField();
		textField_1.setBounds(119, 280, 100, 15);
		getContentPane().add(textField_1);

		BtnSalvar.setBounds(374, 380, 100, 50);
		BtnFechar.setBounds(484, 380, 100, 50);
		BtnFechar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		getContentPane().add(Main);
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
		lblCep.setBounds(50, 317, 40, 14);
		
		getContentPane().add(lblCep);
		lblCom.setBounds(50, 355, 60, 14);
		
		getContentPane().add(lblCom);
		
		JLabel lblComplemento = new JLabel("Complemento: ");
		lblComplemento.setBounds(50, 398, 90, 14);
		getContentPane().add(lblComplemento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 316, 100, 15);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 354, 100, 15);
		getContentPane().add(textField_3);
		textField_4.setBounds(146, 397, 100, 15);
		
		getContentPane().add(textField_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(413, 81, 137, 122);
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Foto");
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(374, 242, 150, 115);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lista Telefonica");
		panel_1.add(lblNewLabel_2);

	}
}
