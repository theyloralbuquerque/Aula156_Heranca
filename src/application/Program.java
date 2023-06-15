package application;

import util.Conta;
import util.Conta_Empresarial;
import util.Conta_Poupanca;

public class Program {

	public static void main(String[] args) {

/*---aula 157	
 	
		Conta cont = new Conta(1001, "Alex", 0.0);
		Conta_Empresarial contE = new Conta_Empresarial(1002,"Maria", 0.0, 500.0);
		
		//UPCASTING
		Conta cont1 = contE; //um objeto superclasse recebe um objeto subclasse.
		Conta cont2 = new Conta_Empresarial(1003, "Bob", 0.0, 200.0);
		Conta cont3 = new Conta_Poupanca(1004, "Ana", 100.0, 0.01);
		
		//DOWNCASTING
		Conta_Empresarial cont4 = (Conta_Empresarial)cont2; //conversão não natural, precisou do CASTING.
		cont4.emprestimo(100.0);
		
		// Conta_Empresarial cont5 = (Conta_Empresarial)cont3;
		if (cont3 instanceof Conta_Empresarial) { //se cont3 for uma instância de Conta_Empresarial então...
			Conta_Empresarial cont5 = (Conta_Empresarial)cont3;
			cont5.emprestimo(200.0);
			System.out.println("Empréstimo realizado!");
		}
		
		if (cont3 instanceof Conta_Poupanca) { //se cont3 for uma instância de Conta_Poupanca então...
			Conta_Poupanca cont5 = (Conta_Poupanca) cont3;
			cont5.atualizacaoDeSaldo();
			System.out.println("Saldo atualizado!");
			
		}
		
*/
		
		Conta cont1 = new Conta(1001, "Alex", 1000.0);
		cont1.saque(200.0);
		System.out.println(cont1.getSaldo());
		
		Conta cont2 = new Conta_Poupanca(1002, "Ana", 1000.0, 0.02);
		cont2.saque(200.0);
		System.out.println(cont2.getSaldo());
		
		Conta cont3 = new Conta_Empresarial(1003, "João", 1000.0, 500.0);
		cont3.saque(200.0);
		System.out.println(cont3.getSaldo());
	}

}
