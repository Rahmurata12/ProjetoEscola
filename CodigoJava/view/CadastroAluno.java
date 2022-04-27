package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import model.bean.Aluno;
import model.bean.Pessoa;
import model.dao.AlunoDAO;
import model.dao.PessoaDAO;

public class CadastroAluno extends JFrame {

	// JPanel
	private JPanel Main = new JPanel();

	// JLabel
	private JLabel Titulo = new JLabel("Cadastro de Alunos");
	private JLabel NomeLabel = new JLabel("Nome: ");
	private JLabel DataNascimentoLabel = new JLabel("Data de Nascimento: ");
	private JLabel RGLabel = new JLabel("RG: ");
	private JLabel CPFLabel = new JLabel("CPF: ");
	private JTextField DataNascimentoTxt = new JTextField();

	// JTextField
	private JTextField NomeTxt = new JTextField();
	
	private JTextField RGTxt = new JTextField();
	private JTextField CPFTxt = new JTextField();

	// JButton
	private JButton BtnSalvar = new JButton("Salvar");
	private JButton BtnFechar = new JButton("Fechar");
	private JTextField NomeMaeTxt;
	private JTextField NomePaiTxt;
	private final JLabel lblCep = new JLabel("CEP: ");
	private final JLabel lblCom = new JLabel("Endere\u00E7o: ");
	private JTextField CEPTxt;
	private JTextField EnderecoTxt;
	private final JTextField CompTxt = new JTextField();

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
		
		Aluno Aluno = new Aluno();
		Pessoa ps = new Pessoa();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(634, 604);
		getContentPane().setLayout(null);

		Titulo.setBounds(150, 20, 150, 15);
		NomeLabel.setBounds(50, 81, 40, 15);
		DataNascimentoLabel.setBounds(50, 120, 150, 15);
		RGLabel.setBounds(50, 160, 27, 15);
		CPFLabel.setBounds(50, 201, 34, 15);

		NomeTxt.setBounds(96, 80, 150, 15);
		DataNascimentoTxt.setBounds(177, 119, 137, 15);
		RGTxt.setBounds(80, 159, 100, 15);
		CPFTxt.setBounds(80, 200, 100, 15);

		JLabel lblNewLabel = new JLabel("Nome M\u00E3e: ");
		lblNewLabel.setBounds(50, 242, 77, 14);
		getContentPane().add(lblNewLabel);

		NomeMaeTxt = new JTextField();
		NomeMaeTxt.setBounds(119, 241, 100, 15);
		getContentPane().add(NomeMaeTxt);

		JLabel lblNomePai = new JLabel("Nome Pai: ");
		lblNomePai.setBounds(50, 281, 68, 14);
		getContentPane().add(lblNomePai);

		NomePaiTxt = new JTextField();
		NomePaiTxt.setBounds(119, 280, 100, 15);
		getContentPane().add(NomePaiTxt);
		BtnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PessoaDAO psDao = new PessoaDAO();
				AlunoDAO alDao = new AlunoDAO();
				
				ps.setNome(NomeTxt.getText());
				ps.setDt_Nascimento(DataNascimentoTxt.getText());
				ps.setRG(RGTxt.getText());
				ps.setCPF(CPFTxt.getText());
				Aluno.setNomeMae(NomeMaeTxt.getText());
				Aluno.setNomePai(NomePaiTxt.getText());
				Aluno.setCep(CEPTxt.getText());
				Aluno.setEndereco(EnderecoTxt.getText());
				Aluno.setComplemento(CompTxt.getText());
				
				psDao.create(ps);
				alDao.create(Aluno);
			}
		});

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
		getContentPane().add(NomeTxt);
		getContentPane().add(DataNascimentoLabel);
		getContentPane().add(DataNascimentoTxt);
		getContentPane().add(RGLabel);
		getContentPane().add(RGTxt);
		getContentPane().add(CPFLabel);
		getContentPane().add(CPFTxt);
		getContentPane().add(BtnSalvar);
		getContentPane().add(BtnFechar);
		lblCep.setBounds(50, 317, 40, 14);

		getContentPane().add(lblCep);
		lblCom.setBounds(50, 355, 60, 14);

		getContentPane().add(lblCom);

		JLabel lblComplemento = new JLabel("Complemento: ");
		lblComplemento.setBounds(50, 398, 90, 14);
		getContentPane().add(lblComplemento);

		CEPTxt = new JTextField();
		CEPTxt.setBounds(96, 316, 100, 15);
		getContentPane().add(CEPTxt);

		EnderecoTxt = new JTextField();
		EnderecoTxt.setBounds(119, 354, 100, 15);
		getContentPane().add(EnderecoTxt);
		CompTxt.setBounds(146, 397, 100, 15);

		getContentPane().add(CompTxt);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(413, 81, 137, 122);
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("Foto");
		panel.add(lblNewLabel_1, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(400, 242, 150, 115);
		getContentPane().add(panel_1);

		JLabel lblNewLabel_2 = new JLabel("Lista Telefonica");
		panel_1.add(lblNewLabel_2);
		
		JButton BtnConverter = new JButton("Salvar arquivo");
		BtnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Aluno.getNomeMae());
				Aluno.getNomePai();
				Aluno.getCep();
				Aluno.getEndereco();
				Aluno.getComplemento();
				
				XStream xstream = new XStream(new DomDriver());
				System.out.println(xstream.toXML(Aluno));
				
				PrintWriter writer = null;
				
				try {
					writer = new PrintWriter(NomeTxt.getText());
					writer.print(xstream.toXML(Aluno));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					JOptionPane.showMessageDialog(null, "Arquivo Gerado com Sucesso!");
				}
				
				writer.close();
			}
		});
		BtnConverter.setBounds(413, 441, 137, 50);
		getContentPane().add(BtnConverter);
		
	}
}
