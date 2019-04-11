import javax.swing.JOptionPane;

public class Movimentacao {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(500, 1000);
		ContaPoupanca cp = new ContaPoupanca(5000, 0.01);
		GerenciadorContas gc = new GerenciadorContas(0);
		
		int i;
		do {
			
			i = menu();
			
			switch (i) {
			case 1:
				contaCorrente(cc);
				break;
			case 2:
				contaPoupanca(cp);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Saldo total de todas as contas: "+gc.getSaldoTotal());
				break;
			}
			
		}while(i != 0);
		
		
	}

	private static void contaPoupanca(ContaPoupanca cp) {
		int i;
		do {
			i = subMenu();
			switch (i) {
			case 1:
				cp.creditar(Integer.parseInt(
						JOptionPane.showInputDialog("Qual o valor do deposíto? ")));
				break;
			case 2:
				cp.debitar(Integer.parseInt(
						JOptionPane.showInputDialog("Qual o valor do saque? ")));				
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Seu saldo é "+cp.getSaldo());
				break;
			case 4:
				cp.atualizarSaldo(Integer.parseInt(
						JOptionPane.showInputDialog("Qual o valor da porcentagem? ")));
				break;
			}
		
			
		}while(i != 0);
	}

	private static void contaCorrente(ContaCorrente cc) {
		int i;
		do {
			i = subMenu();
			switch (i) {
			case 1:
				cc.creditar(Integer.parseInt(
						JOptionPane.showInputDialog("Qual o valor do deposíto? ")));
				break;
			case 2:
				cc.debitar(Integer.parseInt(
						JOptionPane.showInputDialog("Qual o valor do saque? ")));				
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Seu saldo é "+cc.getSaldo());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Saldo atualizado");			
				break;
			}
		
			
		}while(i != 0);
	}
	
	private static int menu() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n"
				 + "1 - Conta corrente \n" 
				 + "2 - Poupança \n" 
				 + "3 - Consultar total dos saldos \n" 
				 + "0 - Sair \n"));
		return i;
	}
	
	private static int subMenu() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Submenu \n"
				 + "1 - Depositar \n" 
				 + "2 - Sacar \n" 
				 + "3 - Consultar saldo \n" 
				 + "4 - Reajustar saldo \n" 
				 + "0 - Sair \n"));
		
		return i;
	}
	

}
