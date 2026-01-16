import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 2002;
        int tentativa = 0;
        System.out.println("Digite a senha de acesso:");
        while(tentativa != senha){
            tentativa = scanner.nextInt();
            if(tentativa == senha) System.out.println("Acesso permitido!");
            else System.out.println("Senha invalida, tente novamente:");
            }
        scanner.close();
        }
    }
