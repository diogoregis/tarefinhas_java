package tarefinha06;

public class ExibirInformacao {
	
	public static void main(String[] args) {
		exibirAnimal("Bily", "Cachorro", 12);
		
		exibirAnimal("Dore", "Galinha", 5);
	}
	
	public static void exibirAnimal(String nome, String animal, double peso) {
		System.out.println("Nome do animal: " + nome);
		if (animal.equals("Cachorro")) {
			System.out.println("Au Au");
			
		}
		else if (animal.equals("Galinha"))
			System.out.println("Piu Piu");
	}	

}

