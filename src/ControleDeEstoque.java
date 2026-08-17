import java.util.Scanner;
class ControleDeEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao = 0;


        while (opcao != 3) {
            System.out.println("==== Controle de Estoque ====");
            System.out.println();
            System.out.println("1- Adicionar produto");
            System.out.println("2- Listar produtos");
            System.out.println("3- Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            System.out.println();
            if (opcao == 1) {
            System.out.println("Você escolheu adicionar produto: ");
            }else if (opcao == 2) {
            System.out.println("Você escolheu listar produtos: ");
            }else if (opcao == 67) {
            System.out.println("Farmou aura ");
            } else if (opcao == 3) {
            System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opção inválida. Digite novamente: ");
            }
        }
        sc.close();
    }
}