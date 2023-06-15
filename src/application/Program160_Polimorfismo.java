package application;

import util.Conta;
import util.Conta_Poupanca;

public class Program160_Polimorfismo {

	public static void main(String[] args) {
		
		Conta x = new Conta(1001, "Ana", 1000.0);
		Conta y = new Conta_Poupanca(1002, "Jo�o", 1000.0, 0.02);
		
		x.saque(50.0); // esse m�todo ser� executado na classe Conta.
		y.saque(50.0); // esse m�todo ser� executado na classe Conta_Poupanca.
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	}

}
