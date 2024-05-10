package me.sairu;

public class Main {

    public static void main(String[] args) {
        Cliente sairu = new Cliente();
        sairu.setNome("Sairu");

        Conta cc = new ContaCorrente(sairu);
        Conta poupanca = new ContaPoupanca(sairu);

        try {
            // Teste de depósito
            cc.depositar(100);
            System.out.println("Teste de Depósito: " + (cc.getSaldo() == 100 ? "Passou" : "Falhou"));

            // Teste de saque
            cc.sacar(50);
            System.out.println("Teste de Saque: " + (cc.getSaldo() == 50 ? "Passou" : "Falhou"));

            // Teste de transferência
            cc.transferir(50, poupanca);
            System.out.println("Teste de Transferência: " + (cc.getSaldo() == 0 && poupanca.getSaldo() == 50 ? "Passou" : "Falhou"));

            // Teste de imprimir extrato
            System.out.println("Teste de Imprimir Extrato:");
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}