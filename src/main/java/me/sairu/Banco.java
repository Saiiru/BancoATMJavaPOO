package me.sairu;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Banco {

    private final List<Conta> contas = new ArrayList<>();

    public void criarConta(Cliente cliente, String tipoConta) throws Exception {
        if (tipoConta.equals("corrente")) {
            contas.add(new ContaCorrente(cliente));
        } else if (tipoConta.equals("poupanca")) {
            contas.add(new ContaPoupanca(cliente));
        } else {
            throw new Exception("Tipo de conta inválido");
        }
    }

    public Conta getConta(Cliente cliente) throws Exception {
        for (Conta conta : contas) {
            if (conta.getCliente().equals(cliente)) {
                return conta;
            }
        }
        throw new Exception("Conta não encontrada");
    }
}