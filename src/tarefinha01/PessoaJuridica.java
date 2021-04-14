package tarefinha01;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class PessoaJuridica {

    private String nome, cnpj, endereco, bairro, cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public String formatarDocumento() {
        MaskFormatter maskFormatter;
        try {
            maskFormatter = new MaskFormatter("##.###.###/####-##");
            maskFormatter.setValueContainsLiteralCharacters(false);
            return maskFormatter.valueToString(getCnpj());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return getCnpj();
    }

}
