
public class Main {

	public static void main(String[] args) {
		Cliente evandro = new Cliente();
		evandro.setNome("Evandro");
		
		Conta cc = new ContaCorrente(evandro);
		Conta poupanca = new ContaPoupanca(evandro);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}