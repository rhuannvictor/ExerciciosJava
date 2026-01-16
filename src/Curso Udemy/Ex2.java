/*Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.
0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação
, caso contrário imprime no console "Reprovado".r;*/

import java.util.Scanner;
public class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();
        if(nota1<0||nota1>10){
            System.out.println("Nota inválida!!!");
            System.exit(0);
        }
        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();
        if(nota2<0||nota2>10){
            System.out.println("Nota inválida!!!");
            System.exit(0);
        }
        double media = (nota1+nota2)/2;
        if(media>=7 && media<=10){
            System.out.println("Aprovado!!!");
        }
        else if(media<7 && media>=4){
            System.out.println("Recuperação!!!");
        }
        else{
            System.out.println("Reprovado!!!");
        }
        scanner.close();
    }
}