package me.sairu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente sairu = new Cliente();
        sairu.setNome("Sairu");
        sairu.setSenha("1234");

        Banco banco = new Banco();
        banco.criarContaCorrente(sairu);
        banco.criarContaPoupanca(sairu);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite sua senha:");
            String senha = scanner.nextLine();
            if (!banco.autenticarCliente(sairu, senha)) {
                System.out.println("Senha incorreta. Tente novamente.");
                continue;
            }

            System.out.println("Escolha uma operação: 1 - Depósito, 2 - Saque, 3 - Transferência, 4 - Ver saldo");
            int operacao = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            System.out.println("Escolha uma conta: 1 - Corrente, 2 - Poupança");
            int tipoConta = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            Conta conta = tipoConta == 1 ? banco.getContaCorrente(sairu) : banco.getContaPoupanca(sairu);
            if (conta == null) {
                System.out.println("Conta não encontrada. Tente novamente.");
                continue;
            }

            switch (operacao) {
                case 1:  // Depósito
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline left-over
                    if (!conta.depositar(valorDeposito)) {
                        System.out.println("Depósito falhou. Tente novamente.");
                    }
                    break;
                case 2:  // Saque
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline left-over
                    if (!conta.sacar(valorSaque)) {
                        System.out.println("Saque falhou. Tente novamente.");
                    }
                    break;
                case 3:  // Transferência
                    System.out.println("Digite o valor da transferência:");
                    double valorTransferencia = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline left-over
                    Conta contaDestino = tipoConta == 1 ? banco.getContaPoupanca(sairu) : banco.getContaCorrente(sairu);
                    if (!conta.transferir(valorTransferencia, contaDestino)) {
                        System.out.println("Transferência falhou. Tente novamente.");
                    }
                    break;
                case 4:  // Ver saldo
                    conta.imprimirExtrato();
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
        }
    }
}