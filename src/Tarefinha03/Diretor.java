package Tarefinha03;

public class Diretor {

    private String nome, cpf, senha;
    private double  salario;
    private int qtdFuncionario;

    public boolean autenticar (String senha){
        return this.senha.equals(senha);
    }

}
