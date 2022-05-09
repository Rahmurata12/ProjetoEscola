package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import model.bean.Aluno;
import model.bean.Telefone;
import model.dao.AlunoDAO;
import model.dao.TelefoneDAO;

@SuppressWarnings("serial")
public class CadastroAluno extends JFrame {

	// FormatedText
	private MaskFormatter ftmData;
	private MaskFormatter ftmRG;
	private MaskFormatter ftmCPF;
	private MaskFormatter ftmNumTel;
	private MaskFormatter ftmCEP;

	private JTextField dtNasc;
	private JTextField RG;
	private JTextField CPF;
	private JTextField CEP;

	// JPanel
	private JPanel Main = new JPanel();

	// JLabel
	private JLabel Titulo = new JLabel("Cadastro de Alunos");
	private JLabel NomeLabel = new JLabel("Nome: ");
	private JLabel DataNascimentoLabel = new JLabel("Data de Nascimento: ");
	private JLabel RGLabel = new JLabel("RG: ");
	private JLabel CPFLabel = new JLabel("CPF: ");

	// JTextField
	private JTextField NomeTxt = new JTextField();

	// JButton
	private JButton BtnSalvar = new JButton("Salvar");
	private JButton BtnFechar = new JButton("Fechar");
	private JTextField NomeMaeTxt;
	private JTextField NomePaiTxt;
	private final JLabel lblCep = new JLabel("CEP: ");
	private final JLabel lblCom = new JLabel("Endere\u00E7o: ");
	private JTextField EnderecoTxt;
	private final JTextField CompTxt = new JTextField();
	private JTable listaTelefonicaTbl = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();

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

		Aluno al = new Aluno();

		try {
			ftmData = new MaskFormatter("##/##/####");
			ftmRG = new MaskFormatter("#########");
			ftmCPF = new MaskFormatter("###########");
			ftmNumTel = new MaskFormatter("55###########");
			ftmCEP = new MaskFormatter("########");
		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(750, 600);
		getContentPane().setLayout(null);

		Titulo.setBounds(150, 20, 150, 15);
		NomeLabel.setBounds(50, 81, 40, 15);
		DataNascimentoLabel.setBounds(50, 120, 126, 15);
		RGLabel.setBounds(50, 160, 27, 15);
		CPFLabel.setBounds(50, 201, 34, 15);

		NomeTxt.setBounds(96, 80, 150, 15);

		dtNasc = new JFormattedTextField(ftmData);
		RG = new JFormattedTextField(ftmRG);
		CPF = new JFormattedTextField(ftmCPF);
		CEP = new JFormattedTextField(ftmCEP);
		dtNasc.setBounds(178, 117, 68, 20);
		getContentPane().add(dtNasc);
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

				AlunoDAO dao = new AlunoDAO();

				al.setNome(NomeTxt.getText());
				al.setDt_Nascimento(dtNasc.getText());
				al.setRG(RG.getText());
				al.setCPF(CPF.getText());
				al.setNomeMae(NomeMaeTxt.getText());
				al.setNomePai(NomePaiTxt.getText());
				al.setCep(CEP.getText());
				al.setEndereco(EnderecoTxt.getText());
				al.setComplemento(CompTxt.getText());

				dao.create(al);
			}
		});

		BtnSalvar.setBounds(50, 472, 100, 50);
		BtnFechar.setBounds(320, 472, 100, 50);
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
		getContentPane().add(RGLabel);
		getContentPane().add(CPFLabel);
		getContentPane().add(BtnSalvar);
		getContentPane().add(BtnFechar);
		lblCep.setBounds(50, 317, 40, 14);

		getContentPane().add(lblCep);
		lblCom.setBounds(50, 355, 60, 14);

		getContentPane().add(lblCom);

		JLabel lblComplemento = new JLabel("Complemento: ");
		lblComplemento.setBounds(50, 398, 90, 14);
		getContentPane().add(lblComplemento);

		CEP.setBounds(87, 316, 100, 15);
		getContentPane().add(CEP);

		EnderecoTxt = new JTextField();
		EnderecoTxt.setBounds(119, 354, 100, 15);
		getContentPane().add(EnderecoTxt);
		CompTxt.setBounds(146, 397, 100, 15);

		getContentPane().add(CompTxt);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(464, 80, 150, 122);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Foto");
		lblNewLabel_1.setBounds(52, 11, 44, 14);
		panel.add(lblNewLabel_1);

		JPanel ListaTelefonica = new JPanel();
		ListaTelefonica.setBackground(Color.WHITE);
		ListaTelefonica.setBounds(398, 242, 314, 148);
		getContentPane().add(ListaTelefonica);
		ListaTelefonica.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Lista Telefonica");
		lblNewLabel_2.setBounds(38, 5, 93, 14);
		ListaTelefonica.add(lblNewLabel_2);

		JButton btnNovoTel = new JButton("Novo");
		btnNovoTel.setBounds(223, 33, 81, 23);
		btnNovoTel.addActionListener(new ActionListener() {
			private JFormattedTextField numeroTel;

			public void actionPerformed(ActionEvent e) {

				Telefone tel = new Telefone();
				TelefoneDAO dao = new TelefoneDAO();
				String[] tipos = { "Residencial", "Pessoal", "Trabalho", "Outros" };

				numeroTel = new JFormattedTextField(ftmNumTel);
				@SuppressWarnings({ "rawtypes", "unchecked" })
				JComboBox tipoTel = new JComboBox(tipos);

				JPanel cttPanel = new JPanel();
				cttPanel.add(new JLabel("Tipo: "));
				cttPanel.add(tipoTel);
				cttPanel.add(Box.createHorizontalStrut(20));
				cttPanel.add(new JLabel("Numero: "));
				cttPanel.add(numeroTel);

				int result = JOptionPane.showConfirmDialog(null, cttPanel, "Novo Telefone",
						JOptionPane.OK_CANCEL_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					tel.setTipoTel((String) tipoTel.getSelectedItem());
					tel.setNumero(numeroTel.getText());
					dao.create(tel);
				}
			}
		});

		String[] colunas = { "ID", "Tipo", "Número" };
		Telefone[][] telVetor = new Telefone[4][3];

		JButton BtnConverter = new JButton("Salvar arquivo");

		ListaTelefonica.add(btnNovoTel);
		scrollPane.setBounds(21, 30, 192, 100);

		ListaTelefonica.add(scrollPane);
		listaTelefonicaTbl = new JTable(telVetor, colunas);
		listaTelefonicaTbl.setBackground(Color.LIGHT_GRAY);
		listaTelefonicaTbl.setEnabled(false);
		scrollPane.setViewportView(listaTelefonicaTbl);
		

		BtnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(al.getNome());
				System.out.println(al.getDt_Nascimento());
				System.out.println(al.getRG());
				System.out.println(al.getCPF());
				System.out.println(al.getNomeMae());
				System.out.println(al.getNomePai());
				System.out.println(al.getCep());
				System.out.println(al.getEndereco());
				System.out.println(al.getComplemento());
				XStream xstream = new XStream(new DomDriver());
				System.out.println(xstream.toXML(al));
				PrintWriter writer = null;
				try {
					writer = new PrintWriter(NomeTxt.getText());
					writer.print(xstream.toXML(al));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					JOptionPane.showMessageDialog(null, "Arquivo Gerado com Sucesso!");
				}
				writer.close();
			}
		});
		BtnConverter.setBounds(163, 472, 137, 50);
		getContentPane().add(BtnConverter);
		RG.setBounds(87, 157, 100, 20);

		getContentPane().add(RG);
		CPF.setBounds(87, 198, 100, 20);

		getContentPane().add(CPF);

	}
}