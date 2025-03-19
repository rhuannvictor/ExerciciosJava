//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num = scanner.nextInt();
        if (num >=0 && num <=10 && num%2==0){
            System.out.println("O numero está entre 0 e 10 e é par!");
        }
        else if (num<0 || num>10){
            System.out.println("O numero não está no intervalo indicado!");
        }
        else{
            System.out.println("O numero é ímpar!");
        }
        scanner.close();
    }
}