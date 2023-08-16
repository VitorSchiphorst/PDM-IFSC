package revisao1;

public class Endereco {
	private String cidade;
	private String rua;
	private Integer numero;
	
	public Endereco() {}

	public Endereco(Endereco end) {
		// TODO Auto-generated constructor stub
	}

	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
