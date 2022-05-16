package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class GuiPrincipal extends JFrame{
	private JTable table;
    private final String colunas[]={"Nome","Idade","Sexo"};
    
    private final String dados[][]= new String[2][3];
   
        /*Construtor da classe ,
          antes de executar o metodo main(),
          ir� construir o JFrame e a JTable*/
    public GuiPrincipal() {
        setLayout(new FlowLayout());//tipo de layout
        setSize(new Dimension(600, 200));//tamanho do Formulario
        setLocationRelativeTo(null);//centralizado
        setTitle("Exemplo JTable");//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setando a a��o padr�o de fechamento do Formul�rio,
                                                          // neste caso  ir� fechar o programa
        ArrayList<bean> Pessoas = new ArrayList();
        bean Rafael = new bean("Rafael", "12", "Masc");
        bean Marcelo = new bean("Marcelo", "12", "mas");
        Pessoas.add(Rafael);
        dados[0][0] = Pessoas.get(0).getNome();
        dados[0][1] = Rafael.getIdade();
        dados[0][2] = Rafael.getSexo();
        
                //instanciando a JTable
        table=new JTable(dados,colunas);
        table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
        table.setFillsViewportHeight(true);
         
                //adicionando a tabela em uma barra de rolagem, ficar� envolta , pela mesma 
        JScrollPane scrollPane=new JScrollPane(table);
                 
                //adicionando ao JFrame "Formul�rio" a JTable "Tabela" 
        add(scrollPane);
    }
     
        //este � o m�todo onde � executado nosso programa
    public static void main(String[] args) {
        new GuiPrincipal().setVisible(true);
    }
     
}