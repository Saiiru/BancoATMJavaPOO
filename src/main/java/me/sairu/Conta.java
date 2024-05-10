package me.sairu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta {

    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    @Override
    public boolean transferir(double valor, IConta contaDestino) {
        if (valor <= 0 || this.saldo < valor || contaDestino == null) {
            return false;
        }
        this.saldo -= valor;
        contaDestino.depositar(valor);
        return true;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}