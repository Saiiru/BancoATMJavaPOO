package me.sairu;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    private Banco banco;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public void realizarOperacao(String tipoOperacao, double valor, Conta contaDestino) throws Exception {
        Conta conta = banco.getConta(this);

        if (tipoOperacao.equals("deposito")) {
            conta.depositar(valor);
        } else if (tipoOperacao.equals("saque")) {
            conta.sacar(valor);
        } else if (tipoOperacao.equals("transferencia")) {
            conta.transferir(valor, contaDestino);
        } else {
            throw new Exception("Tipo de operação inválido");
        }
    }
}