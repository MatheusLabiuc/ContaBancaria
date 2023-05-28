import java.util.Scanner;

public class ContaBancariaUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDaConta = Conta.validaInput(scanner);
        System.out.println("Insira o saldo inicial: ");
        double saldo = scanner.nextDouble();
        Conta conta = new Conta(numeroDaConta, saldo);
            
            boolean done = false;
            while (!done) {
                System.out.println("Escolha a opção desejada: ");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Verificar Saldo");
                System.out.println("4. Sair");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Insira o valor que deseja depositar: ");
                        double depositarValor = scanner.nextDouble();
                        conta.depositar(depositarValor);
                        break;
                    case 2:
                        System.out.println("Insira o valor que deseja sacar: ");
                        double sacaValor = scanner.nextDouble();
                        conta.sacar(sacaValor);
                        break;
                    case 3:
                        System.out.println("Seu saldo atual é: " + conta.saldo());
                        break;
                    case 4:
                        done = true;
                        break;
                    default:
                        System.out.println("Escolha inválida");
                }
            }
        }
    }