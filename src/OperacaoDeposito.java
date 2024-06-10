public class OperacaoDeposito extends Operacao {

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }
    public String toString() {
        String depositoString = this.getData() + "\t" + this.getTipo() + "\t" + this.getValor();

        return depositoString;
    }
}