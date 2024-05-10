package me.sairu;

public class ContaCorrente extends Conta implements IConta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo atual: " + this.getSaldo());
    }
}