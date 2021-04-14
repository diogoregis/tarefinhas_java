package tarefinha08;

import tarefinha07.Funcionario;
import tarefinha07.Monitor;
import tarefinha07.Professor;

public class Relatorio {
	
	public static void main(String[] args) {
		Relatorio relatorio = new Relatorio();
		
		Professor professor = new Professor("Renato", 5000, 20);
		Monitor monitor = new Monitor("Rafael", 5000, 20);
		
		relatorio.gerencialFuncionario(professor);
		
		System.out.println("-----------------------------------------");
		 
		relatorio.gerencialFuncionario(monitor);
	}
	
	public void gerencialFuncionario(Funcionario funcionario) {
		System.out.println(funcionario.getClass().getSimpleName());
		System.out.println(funcionario.getinfo());
		System.out.println(funcionario.getGatficacao());
		
	}

}
