package tarefinha02;

public class Carro {

	private String modelo;

	private int velocidadeMaxima;

	private double segundosZeroACem;

	Pneu pneu;

	Motor motor;

	Chassi chassi;

	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Pneu pneu, Motor motor, Chassi chassi) {
		this.chassi = chassi;
		this.modelo = modelo;
		this.motor = motor;
		this.pneu = pneu;
		this.segundosZeroACem = segundosZeroACem;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getSegundosZeroACem() {
		return segundosZeroACem;
	}

	public void setSegundosZeroACem(double segundosZeroACem) {
		this.segundosZeroACem = segundosZeroACem;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Chassi getChassi() {
		return chassi;
	}

	public void setChassi(Chassi chassi) {
		this.chassi = chassi;
	}

}
