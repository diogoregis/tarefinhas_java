package tarefinha02;

public class Chassi {
	
	private String numero;
	
	private int ano;
	
	public Chassi(String numero, int ano) {
		this.ano = ano;
		this.numero = numero;
	}
	

	@Override
	public String toString() {
		return "Chassi [numero= " + numero + ", ano= " + ano + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
