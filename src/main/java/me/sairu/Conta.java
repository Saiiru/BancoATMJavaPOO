package me.sairu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta {

    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws Exception {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }

    public void transferir(double valor, Conta contaDestino) throws Exception {
        if (this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            throw new Exception("Saldo insuficiente para transferência");
        }
    }

    public void imprimirExtrato() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}