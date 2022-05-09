package model.bean;

public class Aluno extends Pessoa{


	public Aluno(String nomeMae, String nomePai, String cep, String endereco, String complemento) {
		super();
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.cep = cep;
		this.endereco = endereco;
		this.complemento = complemento;
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	private String nomeMae;
	private String nomePai;
	private String cep;
	private String endereco;
	private String complemento;
	private int cd_Al;
	private int cd_Al_Pessoa;
	
	public Aluno(String nome, String dt_Nascimento, String rG, String cPF, String nomeMae, String nomePai, String cep,
			String endereco, String complemento, int cd_Al, int cd_Al_Pessoa) {
		super(nome, dt_Nascimento, rG, cPF);
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.cep = cep;
		this.endereco = endereco;
		this.complemento = complemento;
		this.cd_Al = cd_Al;
		this.cd_Al_Pessoa = cd_Al_Pessoa;
	}

	public int getCd_Al() {
		return cd_Al;
	}

	public void setCd_Al(int cd_Al) {
		this.cd_Al = cd_Al;
	}

	public int getCd_Al_Pessoa() {
		return cd_Al_Pessoa;
	}

	public void setCd_Al_Pessoa(int cd_Al_Pessoa) {
		this.cd_Al_Pessoa = cd_Al_Pessoa;
	}

	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}