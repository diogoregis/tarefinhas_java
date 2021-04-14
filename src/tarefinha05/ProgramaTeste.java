package tarefinha05;

public class ProgramaTeste {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Bily", "ra�ao", 12);
		cachorro.dormir();
		cachorro.fazerBarulho();
		
		System.out.println("=========================================");
		
		Galinha galinha = new Galinha("Dore", "milho", 5);
		galinha.dormir();
		galinha.fazerBarulho();	
		
		
	}
}
