package tarefinha04;

public class Diretor extends Gerente{

    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar (String senha){
        return this.senha.equals(senha);
    }

    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        diretor.setNome("Goal Bruno");
        diretor.setCpf("12378965422");
        diretor.setSalario(3670.66);
        diretor.setQtdFuncionario(16);
        diretor.setSenha("123");

        System.out.println(diretor.autenticar("123"));

    }


}
