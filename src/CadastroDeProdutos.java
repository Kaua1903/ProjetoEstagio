import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CadastroDeProdutos {   
    static void cadastrarProduto(ArrayList<Produto> produtos, Scanner sc){
        
            System.out.println("Tipo de produto: ");
            System.out.println("1 - Comum: ");
            System.out.println("2 - Eletrônico: ");
            System.out.println("3 - Alimentício: ");
            int tipoProduto = 0;
            try{
                tipoProduto = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
            }
            
            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite a quantidade do produto: ");
            int quantidade = 0;
            try{
                quantidade = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
            }

            if (tipoProduto == 1) {
                produtos.add(new Produto(nome, quantidade));
            }else if (tipoProduto == 2){
                System.out.println("Digite os meses de garantia: ");
                int meses = 0;
                try{
                    meses = sc.nextInt();
                    sc.nextLine();
                }catch(InputMismatchException e){
                    System.out.println("Entrada inválida. Digite um número.");
                    sc.nextLine();
                }
                produtos.add(new ProdutoEletronico(nome, quantidade, meses));
            }else if (tipoProduto == 3) {
                System.out.println("Digite a data de validade: ");
                String validade = sc.nextLine();
                produtos.add(new ProdutoAlimenticio(nome, quantidade, validade));
            } else {
                System.out.println("Número inválido.");
            }
    }
    static void listarProdutos(ArrayList<Produto> produtos, int totalProdutos){
        System.out.println("==== Lista de Produtos ====");
                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println(produtos.get(i).exibirDetalhes());
                } if (totalProdutos == 0){
                    System.out.println("Nenhum produto cadastrado.");
                }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        ArrayList<Produto> produtos = new ArrayList<>();

    

        while (opcao != 3) {
            System.out.println("==== Cadastro de Produtos ====");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println( );
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Listar produtos");
            System.out.println("3- Sair");
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
                opcao = 0;
         }

            if (opcao == 1) {
             cadastrarProduto(produtos, sc);
            }
            else if (opcao == 2) {
                listarProdutos(produtos, produtos.size());
            }
            else if (opcao == 3) {
            System.out.println("Saindo do sistema...");
            } else { System.out.println("Opção inválida."); 

            }

        }
        sc.close();
    }
}
