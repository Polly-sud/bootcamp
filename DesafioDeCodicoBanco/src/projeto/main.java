package projeto;
public class main {

	public static void main(String[] args) {
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		
		Conta corrente = new contaCorrente(lucas);
		Conta poupanca = new contaPoupanca(lucas);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
