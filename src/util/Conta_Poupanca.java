package util;

public final class Conta_Poupanca extends Conta{
	
	private Double taxaDeJuros;

	public Conta_Poupanca() {
		super();
	}

	public Conta_Poupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	/*
	 * m�todo que atualiza o saldo + a taxa de juros que o saldo rendeu em determinado per�odo,
	 * ou seja, o saldo da conta ir� aumentar.
	 */
	public void atualizacaoDeSaldo() { 
		saldo += saldo * taxaDeJuros;
	}
	
	@Override //o @Override avisa ao compilador que o m�todo � uma sobreposi��o da superclasse.
	public final void saque(Double valor) {
		saldo -= valor;
	}

}
