/* Programa que simula a entrada de um usuário em uma aplicação com usuário e senha armazenados
 * no "banco de dados", utilizando somente números inteiros; */

import java.util.Scanner;
public class Ex7
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = 1234;
        int senha = 9999;

        System.out.println("Informe o usuário: ");
        int tentativa = scanner.nextInt();
        if (tentativa == user){
            System.out.println("Informe a senha: ");
            int tentativaSenha = scanner.nextInt();
            if (tentativaSenha == senha)System.out.println("Acesso permitido");
            else System.out.println("Senha incorreta");
        }
        else System.out.println("Usuário incorreto");

        scanner.close();
    }
}