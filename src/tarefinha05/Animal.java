package tarefinha05;

public class Animal {

	private String nome;

	private String comida;

	private double peso;
	
	public Animal() {
		
	}
	

	public Animal(String nome, String comida, double peso) {
		this.nome = nome;
		this.comida = comida;
		this.peso = peso;
	}

	public void dormir() {
		System.out.println("Dormir");
	}

	public void fazerBarulho() {
		System.out.println("Fazer barulho");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
