import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("Nome: ");
    String nome = sc.nextLine();

    System.out.println("Idade: ");
    int idade = sc.nextInt();
    sc.nextLine(); // 

    System.out.println("Curso: ");
    String curso = sc.nextLine();

    sc.close();

    System.out.println("=== CADASTRO REALIZADO ===");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Curso: " + curso);
    System.out.println("Cadastro realizado com sucesso!");
    
    }
}