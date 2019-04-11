import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {	
	
	private double limiteEspecial;
	
	public ContaCorrente() {
		super();
	}
	
	

	public ContaCorrente(double saldo, double limiteEspecial) {
		super(saldo);
		this.limiteEspecial = limiteEspecial;
	}



	@Override
	public void atualizarSaldo() {
		if(super.saldo < 0) {
			double saldoAntigo = getSaldo();
			super.saldo -= super.saldo*0.08;
			JOptionPane.showMessageDialog(null, "Seu saldo foi de "+saldoAntigo+" para "+getSaldo());
		}
	}
	
	@Override
	public void debitar(double valor) {
		super.debitar(valor - limiteEspecial);
	}

}
