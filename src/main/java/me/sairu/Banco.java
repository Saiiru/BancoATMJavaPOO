package me.sairu;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@NoArgsConstructor
public class Banco {

    private final Map<Cliente, Conta> contasCorrentes = new HashMap<>();
    private final Map<Cliente, Conta> contasPoupancas = new HashMap<>();

    public void criarContaCorrente(Cliente cliente) {
        contasCorrentes.put(cliente, new ContaCorrente(cliente));
    }

    public void criarContaPoupanca(Cliente cliente) {
        contasPoupancas.put(cliente, new ContaPoupanca(cliente));
    }

    public Conta getContaCorrente(Cliente cliente) {
        return contasCorrentes.get(cliente);
    }

    public Conta getContaPoupanca(Cliente cliente) {
        return contasPoupancas.get(cliente);
    }

    public boolean autenticarCliente(Cliente cliente, String senha) {
        return cliente.getSenha().equals(senha);
    }
}