import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ContaBancaria conta = null;
        
        int opcao = 0;

        while (opcao !=7) {

            System.out.println("=== MENU ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar cheque especial");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
          switch (opcao) {
            case 1:
                    System.out.print("Deposite um valor inicial: ");
                    double depositoInicial = scanner.nextDouble();
                    conta = new ContaBancaria(depositoInicial);
                    System.out.println("Conta criada com sucesso!");
               
                break;
            
            case 2:
                if (conta == null) {
                    System.out.println("Você precisa criar uma conta");
                    break;  
                } else {
                   System.out.println(" Saldo atual: " + conta.getSaldo());
                }
                break;
            
            case 3:
                if (conta == null) {
                    System.out.println("Você precisa criar uma conta");
                } else {
                   System.out.println("Qual valor você deseja depositar?");
                   double adicionarDinheiro = scanner.nextDouble();
                   conta.depositar(adicionarDinheiro);
                   System.out.println("Depósito realizado com sucesso!");
                }
                break; 
            
            case 4: 
                if (conta == null) {
                    System.out.println("Você precisa criar uma conta");
                } else {    
                    System.out.println("Qual valor você deseja sacar?");
                    double retirarDinheiro = scanner.nextDouble();
                    conta.saque(retirarDinheiro);
                    System.out.println("Saque realizado com sucesso!");
                }
                break;
            case 5:
                if (conta == null) {
                    System.out.println("Você precisa criar uma conta");
                } else {
                    System.out.println("Digite o valor do boleto:");
                    double valor = scanner.nextDouble();
                    conta.pagarBoleto(valor);
                    System.out.println("Boleto pago com sucesso!");
                }
                break;
            case 6:
                  if (conta == null) {
                    System.out.println("Você precisa criar uma conta primeiro!");
                } else {
                    System.out.println("Limite do cheque especial: " + conta.getLimiteChequeEspecial());
                    System.out.println("Está usando cheque especial? " + conta.estaUsandoChequeEspecial());
                }
                break;
            
            case 7:
                System.out.println("Fechando o Programa...");
                break;
            default:
          
          }
            
    
        }
    }   
        
}
