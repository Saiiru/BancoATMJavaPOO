package me.sairu;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo atual em Conta Poupança: " + this.getSaldo());
    }
}