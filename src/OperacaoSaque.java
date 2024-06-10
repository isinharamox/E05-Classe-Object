public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor) {
        super('s', valor);
    }
    public String toString() {
        String saqueString = this.getData() + "\t" + this.getTipo() + "\t" + this.getValor();

        return saqueString;
    }
}