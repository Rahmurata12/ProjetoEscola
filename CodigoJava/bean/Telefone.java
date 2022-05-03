package model.bean;

public class Telefone {
	
	private String tipoTel;
	private String numero;
	
	public String getTipoTel() {
		return tipoTel;
	}

	public void setTipoTel(String tipoTel) {
		this.tipoTel = tipoTel;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Telefone(String tipoTel, String numero) {
		super();
		this.tipoTel = tipoTel;
		this.numero = numero;
	}

	public Telefone() {
		// TODO Auto-generated constructor stub
	}
	
}