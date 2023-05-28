import java.util.Scanner;

class Conta {
	private int numeroDaConta;
	private double saldo;

	public Conta(int numeroDaConta, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	
	  public void depositar(double valor) 
	  { 
		  saldo += valor; 
	  }
	 

	
	  public void sacar(double valor) 
	  { saldo -= valor; }
	 

	
	  public double saldo() 
	  { 
		  return saldo; 
	  }
	 

	public static int validaInput(Scanner scanner) {
		int numero = 0;
		boolean validaInput = false;
		while (!validaInput) {
			System.out.println("Insira o número da conta: ");
			if (scanner.hasNextInt()) {
				numero = scanner.nextInt();
				validaInput = true;
			} else {
				System.out.println("Entrada inválida. Por favor, insira apenas números.");
				scanner.next();
			}
		}
		return numero;
	}
}