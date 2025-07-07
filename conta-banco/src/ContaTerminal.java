import java.util.Scanner;

public class ContaTerminal{

    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        
        while (true) {
                System.out.println("Digitem entre as opções 0 Até 4");
                System.out.println("1 - Criar conta");
                System.out.println("2 - depositar");
                System.out.println("3 - Transferir");
                System.out.println("4 - extrato conta");
                System.out.println("0 -  sair do sistema");

            
            int opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                System.out.println("Por favor, digite o número da Agência !");
                Conta conta1 = new Conta();
                System.out.println("*(depois ENTER para o próximo campo)*");
                
                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
                case 0:
                System.out.println("Encerrando o sistema. Até mais!");
                    entrada.close(); 
                    return; 
                default:
                    System.out.println("Opção inválida. Tente novamente.");
             


        }
            
        

    }
    
    }
    }
