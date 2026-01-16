//Media de notas de um aluno usando laço de repetição while e comando de saída numérico;

import java.util.Scanner;
public class Ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva -1 para calcular a média.");
        double total = 1; //Inicia com 1 para anular o valor -1;
        double nota = 0;
        int QtdNotas = -1; //Inicia com menos 1 para anular a entrada -1;
        while(nota != -1){
            System.out.println("Informe a nota:");
            nota = scanner.nextDouble();
            if (nota <-1 || nota >10){
                System.out.print("Nota inválida!!!");
                System.exit(0);
            }
            total += nota;
            QtdNotas++;
        }
        double media = total/QtdNotas;
        if(media>=7) System.out.printf("Aprovado com média = %.1f",media);
        else if(media>=4) System.out.printf("Em recuperação com média = %.1f",media);
        else System.out.printf("Reprovado com média = %.1f",media);
        scanner.close();
    }
}