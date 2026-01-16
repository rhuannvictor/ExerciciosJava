/* Informe um grupo de 5 pessoas, definindo o sexo e a altura. Será informado a maior e a menor altura do grupo,
 *  a média de altura dos homens e a quantidade de mulheres */

import java.util.Scanner;
public class Ex5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double MaiorAltura=.0;
        Double MenorAltura=10.0;
        Double AlturaTotal=.0;
        Double altura=.0;
        int QtdMulheres=0;
        int QtdHomens=0;

        for(int x=0;x<5;x++){
            System.out.printf("Informe o sexo da pessoa %d \n",x+1);
            System.out.println("1 para Masculino e 2 para Feminino:");
            int sexo = scanner.nextInt();
            if (sexo == 1){
                QtdHomens++;
                System.out.println("Informe a altura: ");
                altura = scanner.nextDouble();
                AlturaTotal += altura;
            }
            else if (sexo==2){
                QtdMulheres++;
                System.out.println("Informe a altura: ");
                altura = scanner.nextDouble();
            }
            else{
                System.out.println("Sexo inválido");
                System.exit(0);
            }
            if (altura > MaiorAltura) MaiorAltura = altura;
            if (altura < MenorAltura) MenorAltura = altura;
        }
        Double AlturaMedia = AlturaTotal/QtdHomens;
        System.out.println("");
        System.out.println("A maior altura do grupo é " + MaiorAltura + " E a menor é " + MenorAltura);
        System.out.println("A média de altura entre os homens é: " + AlturaMedia);
        System.out.println("A quantidade de mulheres foi de: " + QtdMulheres);

        scanner.close();
    }
}
