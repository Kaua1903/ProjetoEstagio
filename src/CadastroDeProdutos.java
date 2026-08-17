import java.util.Scanner;

public class CadastroDeProdutos {   
    static int cadastrarProduto(Produto[] produtos,  int totalProdutos, Scanner sc){
        if (totalProdutos < produtos.length) {
                    System.out.println("Digite o nome do produto: ");
                    String produto = sc.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    produtos[totalProdutos] = new Produto(produto, quantidade);
                    totalProdutos++;
                }else {
                    System.out.println("Limite de produtos cadastrados atingido.");
                }
                return totalProdutos;
    }
    static void listarProdutos(Produto[] produtos, int totalProdutos){
        System.out.println("==== Lista de Produtos ====");
                for (int i = 0; i < totalProdutos; i++) {
                    System.out.println("Produto: " + produtos[i].nome + " | Quantidade: " + produtos[i].quantidade);
                } if (totalProdutos == 0){
                    System.out.println("Nenhum produto cadastrado.");
                }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        int totalProdutos = 0;
        Produto[] produtos = new Produto[10];

    

        while (opcao != 3) {
            System.out.println("==== Cadastro de Produtos ====");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println( );
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Listar produtos");
            System.out.println("3- Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
               totalProdutos = cadastrarProduto(produtos, totalProdutos, sc);
            }
            else if (opcao == 2) {
                listarProdutos(produtos, totalProdutos);
            }else {
            System.out.println("Saindo do sistema...");
            } 
        
        }
        sc.close();
    }
}
