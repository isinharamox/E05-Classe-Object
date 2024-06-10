import java.util.Date;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    private int numFuncionarios;

    private String setor;

    public PessoaJuridica(String nome, String endereco, Date data, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco, data);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String toString() {
        String PJstring = "--------------- PJ ---------------" +
                "Nome: " + this.getNome() +
                "Data: " + this.getData() +
                "Endereco: " + this.getEndereco() +
                "CNPJ: " + cnpj +
                "Número de Funcionários: " + numFuncionarios +
                "Setor: " + setor +
                "----------------------------------";
        return PJstring;
    }
    public boolean equals(Object obj) {
        if (obj instanceof PessoaJuridica) {
            PessoaJuridica objPJ = (PessoaJuridica) obj;
            if (this.cnpj.equals(objPJ.cnpj)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
