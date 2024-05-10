package me.sairu;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato me.sairu.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
