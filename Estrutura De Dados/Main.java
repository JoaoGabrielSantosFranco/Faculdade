import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws PilhaVaziaException, PilhaCheiaException {
        Scanner leitor = new Scanner(System.in); 
        Contato d = new Contato(0, null, null, null);
    
        while(true){
            System.out.println(" ______________________ ");
            System.out.println("|______[Contatos]______|");
            System.out.println("| 1} Criar Contato     |");
            System.out.println("| 2} Exibir            |");
            System.out.println("| 3} Editar            |");
            System.out.println("| 4} Desfazer edição   |");
            System.out.println("| 5} Excluir           |");
            System.out.println("| 6} Sair              |");
            System.out.println("|______________________|");
            int opcao = leitor.nextInt();
       

            if (opcao == 6){
                System.out.println("Programa Finalizado");
                break;
            }

            if (opcao == 1){
                d.criarContato();
            }

            if (opcao == 2){
                d.exibir();
            }

            if (opcao == 3){
                d.editar();
               
            }

            if (opcao == 4){
                d.desfazer();
             }

             if (opcao == 5){
                d.excluir();
            }

            }
            leitor.close();
        }
    }

