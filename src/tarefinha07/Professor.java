	package tarefinha07;

public class Professor extends Funcionario {
	

	private	int horas;
	
	public Professor() {
		
	}
	
	
	public Professor(String nome, double salario,int horas) {
		super(nome, salario);
		this.horas = horas;
	}


	public double  getGatficacao(){
		return this.getSalario() + (this.horas*20);
		
	}
	
	public String getinfo() {
		String retorno = "Nome: "+this.getNome()+" sou professor com "+this.horas + "/horas e salario R$" +getGatficacao();
		return retorno;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}

}
