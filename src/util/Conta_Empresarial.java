package util;

public class Conta_Empresarial extends Conta { //herança aqui.
	
	private Double limiteDeEmprestimo;
	
	public Conta_Empresarial() { //contrutor padrão.
		super();
	}

	public Conta_Empresarial(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) { //construtor com argumentos. 
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	/* Método que realiza o empréstimo. Verifica se o valor pedido é menor ou igual ao limite de empréstimo
	 * e caso seja é chamado o método 
	 */
	public void emprestimo(Double valor) {
		if (valor <= limiteDeEmprestimo) {  
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void saque(Double valor) {
		super.saque(valor); // utilização do super aqui para reaproveitamento de código do método.
		saldo -= 2.0;
	}

}
