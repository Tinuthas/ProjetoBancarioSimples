
public class GerenciadorContas {
	private double saldoTotal;
	
	public GerenciadorContas(int saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public GerenciadorContas() {
		super();
	}



	public void totalizarSaldos(Conta conta) {
		setSaldoTotal(getSaldoTotal() + conta.getSaldo());
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
}
