import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

	private double ajusteMensal;
	
	public ContaPoupanca(int saldo, double ajusteMensal) {
		super(saldo);
		this.setAjusteMensal(ajusteMensal); 
	}
	
	

	public ContaPoupanca() {
		super();
	}




	@Override
	public void atualizarSaldo() {
		
	}
	
	public void atualizarSaldo(double porcentagem) {
		double saldoAntigo = getSaldo();
		super.saldo += super.saldo*porcentagem; 
		this.setAjusteMensal(porcentagem);
		JOptionPane.showMessageDialog(null, "Seu saldo foi de "+saldoAntigo+" para "+getSaldo());
	}



	public double getAjusteMensal() {
		return ajusteMensal;
	}



	public void setAjusteMensal(double ajusteMensal) {
		this.ajusteMensal = ajusteMensal;
	}

}
