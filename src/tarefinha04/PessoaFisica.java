package tarefinha04;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class PessoaFisica {

    private String nome, cpf, endereco, bairro, cidade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public String getDocumento() {
        return this.cpf;
    }

    public String formatarDocumento() {
        MaskFormatter maskFormatter;
        try {
            maskFormatter = new MaskFormatter("###.###.###-##");
            maskFormatter.setValueContainsLiteralCharacters(false);
            return maskFormatter.valueToString(getCpf());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return getCpf();
    }
}
