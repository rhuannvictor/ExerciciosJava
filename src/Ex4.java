//Jogo para o usuário adivinhar um numero aleatório gerado que está entre 0 e 100;

import java.util.Scanner;
import java.util.Random;
public class Ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int num = gerador.nextInt(100);
        int tentativa = 0;
        int numTentativas = 1;
        int cont = 0;
        int tentativasRestantes = 9;

        while(numTentativas<=10){
            System.out.print("Informe um numero entre 0 e 100: ");
            tentativa = scanner.nextInt();
            if (tentativa==num){
                System.out.printf("Parabéns, você acertou em %d tentativas \n",numTentativas);
                System.exit(0);
            }
            else if (tentativa<num)System.out.printf("numero sorteado é maior! Tentativas restantes: %d \n",tentativasRestantes);
            else System.out.printf("numero sorteado é menor! Tentativas restantes: %d \n",tentativasRestantes);
            numTentativas++;
            tentativasRestantes--;

        }
        scanner.close();
}
}