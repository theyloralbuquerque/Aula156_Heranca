package util;

public class Conta_Empresarial extends Conta { //heran�a aqui.
	
	private Double limiteDeEmprestimo;
	
	public Conta_Empresarial() { //contrutor padr�o.
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

	/* M�todo que realiza o empr�stimo. Verifica se o valor pedido � menor ou igual ao limite de empr�stimo
	 * e caso seja � chamado o m�todo 
	 */
	public void emprestimo(Double valor) {
		if (valor <= limiteDeEmprestimo) {  
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void saque(Double valor) {
		super.saque(valor); // utiliza��o do super aqui para reaproveitamento de c�digo do m�todo.
		saldo -= 2.0;
	}

}
