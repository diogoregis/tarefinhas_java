package tarefinha02;

public class Pneu {

	private int raio;

	private String numeroSerie;

	private String modelo;

	public Pneu(int raio, String numeroSerie, String modelo) {
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Pneu [raio= " + raio + ", numeroSerie= " + numeroSerie + ", modelo= " + modelo + "]";
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
