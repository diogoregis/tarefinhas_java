package tarefinha11;

public class Quadrado implements AreaCalculavel {


	@Override
	public double calcularArea(double lado, double lado2, double lado3) {
		return lado*lado2;
	}
}
