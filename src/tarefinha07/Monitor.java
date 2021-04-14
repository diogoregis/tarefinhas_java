package tarefinha07;

public class Monitor extends Funcionario {
	
	private int horas;
	
	public Monitor() {
		
	}

	public Monitor(String nome,double salario ,int horas) {
		super(nome, salario);
		this.horas = horas;
	}
	
	public double  getGatficacao(){
		return this.getSalario() + (this.horas + 10);
		
	}
	
	//public String getinfo() {
		//String retorno = "Nome: "+this.getNome()+" sou Monitor com "+this.horas + "/horas e salario R$" +getGatficacao();
	//	return retorno;
//	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	

}
