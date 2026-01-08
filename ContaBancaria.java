public class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
    this.saldo = depositoInicial;

    if (depositoInicial <= 500) {
        this.limiteChequeEspecial = 50;
    } else {
        this.limiteChequeEspecial = depositoInicial / 2;
    }
        this.valorUsadoChequeEspecial = 0;

}
    public double getSaldo() {
    return saldo;
}
    public double getLimiteChequeEspecial() {
    return limiteChequeEspecial;
}
   public boolean estaUsandoChequeEspecial() {
    return valorUsadoChequeEspecial > 0;
}
   public void depositar(double adicionarDinheiro) {

    if (valorUsadoChequeEspecial > 0) {

        double taxa = valorUsadoChequeEspecial * 0.2;
        double totalDevido = valorUsadoChequeEspecial + taxa;

        if (adicionarDinheiro >= totalDevido) {
            adicionarDinheiro -= totalDevido;
            valorUsadoChequeEspecial = 0;
        } else {
            valorUsadoChequeEspecial -= adicionarDinheiro;
            return;
        }
    }

    saldo += adicionarDinheiro;
}
  public boolean saque(double retirarDinheiro) {

    double totalDisponivel = saldo + limiteChequeEspecial;

    if (retirarDinheiro > totalDisponivel) {
        return false;
    }

    if (retirarDinheiro <= saldo) {
        saldo -= retirarDinheiro;
    } else {
        double restante = retirarDinheiro - saldo;
        saldo = 0;
        valorUsadoChequeEspecial += restante;
    }

    return true;
}


public boolean pagarBoleto(double valor) {
    return saque(valor);
  
}

}



    









