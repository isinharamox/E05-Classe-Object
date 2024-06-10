import java.util.Date;

public class PessoaFisica extends Cliente {

    private String cpf;

    private int idade;

    private char genero;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char genero) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    public String toString() {
        String PFstring = "--------------- PF ---------------\n" +
                "Nome: " + this.getNome() + "\n" +
                "Data: " + this.getData() + "\n" +
                "Endereco: " + this.getEndereco() + "\n" +
                "CPF:" + cpf + "\n" +
                "Idade:" + idade + "\n" +
                "Genero:" + genero + "\n" +
                "----------------------------------";
        return PFstring;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PessoaFisica) {
            PessoaFisica objPF = (PessoaFisica) obj;
            if (this.cpf.equals(objPF.cpf)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}