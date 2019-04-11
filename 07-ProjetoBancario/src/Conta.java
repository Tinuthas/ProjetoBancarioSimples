import javax.swing.JOptionPane;

public abstract class Conta {
	protected double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public Conta() {
		super();
	}



	public void creditar(double valor) {
		this.saldo += valor;
	}

	public void debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
		}
	}

	public abstract void atualizarSaldo();

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	
}
