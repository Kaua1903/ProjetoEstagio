import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor da sua bolsa: ");
        double bolsa = sc.nextDouble();
        if (bolsa < 1000) {
            System.out.println("Bolsa abaixo da média do mercado para estágio.");
        } else {
            System.out.println("Bolsa dentro da média.");
        }

        System.out.println("Quantas horas você trabalhou esse mês?");
        int horasTrabalhadas = sc.nextInt();
        if (horasTrabalhadas <= 0) {
            System.out.println("Quantidade de horas inválida.");
            sc.close();
            return;
        }
     
        double valorHora = bolsa / horasTrabalhadas;

        System.out.println("======= RESUMO =======");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.printf("Valor da bolsa: R$ %.2f\n", bolsa);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println();
        System.out.printf("Valor recebido por hora:  R$ %.2f\n", valorHora);
        System.out.println();
        System.out.println("=========================");

        sc.close();
    }
}
