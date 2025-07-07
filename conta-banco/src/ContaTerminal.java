
import java.util.Scanner;

public class ContaTerminal{

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        
        while (true) {
                System.out.println("Digitem entre as opções 0 Até 4");
                System.out.println("1 - Criar conta");
                System.out.println("2 - depositar");
                System.out.println("3 - extrato conta");
                System.out.println("0 -  sair do sistema");

            
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Por favor, digite o número da Conta:");
                    conta.setNumero(scanner.nextInt());
                    scanner.nextLine(); 

                    System.out.println("Por favor, digite o número da Agência:");
                    conta.setAgencia(scanner.nextLine());

                    System.out.println("Por favor, digite o nome do Cliente:");
                    conta.setNomeCliente(scanner.nextLine());

                    System.out.println("Por favor, digite o saldo inicial:");
                    conta.setSaldo(scanner.nextDouble());

                    System.out.println("Olá "+ conta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é "+ conta.getAgencia()+", conta "+conta.getNumero()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque.");
                            
                break;
                case 2:
                System.out.println("Por favor, digite o valor do depósito");
                double valorDeposito = scanner.nextDouble();

                System.out.println("Por favor, digite o número da Conta que deseja depositar:");
                int numeroBuscado = scanner.nextInt();

                   if (conta.getNumero() == numeroBuscado) {
                        System.out.println("Conta encontrada!");
                        conta.depositar(valorDeposito);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }

                break;          
                case 3:
                System.out.println("Digite o número da conta:");

                     numeroBuscado = scanner.nextInt();

                    if (conta.getNumero() == numeroBuscado) {
                        System.out.println("Conta encontrada!");
                        conta.visualizarConta();
                    } else {
                        System.out.println("Conta não encontrada.");
                    } 
                break;
                case 0:
                System.out.println("Encerrando o sistema. Até mais!");
                    scanner.close(); 
                    return; 
                default:
                    System.out.println("Opção inválida. Tente novamente.");
        }
    }  
    }
    }
