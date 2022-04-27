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