import java.util.Scanner;   

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "admin";
        String senha = "1234";       

        int tentativas = 3;
        
        while (tentativas > 0) {

        System.out.println("Digite seu usuário: ");
        String inputUsuario = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String inputSenha = sc.nextLine();  

            if (inputUsuario.equals (usuario) && inputSenha.equals (senha)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Usuário ou senha incorretos.");
                tentativas--;
            }
        }
        if (tentativas == 0) {
            System.out.println("Número máximo de tentativas atingido. Acesso negado.");
        }

        sc.close();
    }
}