package model.bean;

public class Pessoa {

	private String nome;
	private String dt_Nascimento;
	private String RG;
	private String CPF;
	private int cd_Pessoa;
	
	public int getCd_Pessoa() {
		return cd_Pessoa;
	}

	public void setCd_Pessoa(int cd_Pessoa) {
		this.cd_Pessoa = cd_Pessoa;
	}

	public Pessoa(String nome, String dt_Nascimento, String rG, String cPF) {
		super();
		this.nome = nome;
		this.dt_Nascimento = dt_Nascimento;
		RG = rG;
		CPF = cPF;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String dt_Nascimento, String rG, String cPF, int cd_Pessoa) {
		super();
		this.nome = nome;
		this.dt_Nascimento = dt_Nascimento;
		RG = rG;
		CPF = cPF;
		this.cd_Pessoa = cd_Pessoa;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDt_Nascimento() {
		return dt_Nascimento;
	}
	public void setDt_Nascimento(String dt_Nascimento) {
		this.dt_Nascimento = dt_Nascimento;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
}