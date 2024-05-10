package me.sairu;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato me.sairu.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
