package tarefinha04;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class PessoaJuridica extends PessoaFisica {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
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
