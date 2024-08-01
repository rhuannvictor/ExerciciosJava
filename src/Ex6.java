/* Criar um programa que calcule a média de salários de uma empresa, pedindo ao
 * usuário a grade de funcionários e os salários, e devolvendo a média salarial. */

import java.util.Scanner;
public class Ex6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double total = 1.0;
        Double salario = 0.0;
        int qtdFuncionarios = -1;
        System.out.println("Digite -1 para calcular a média.");
        while(salario != -1){
            System.out.printf("Informe o salario do funcionário %d: ",qtdFuncionarios+2);
            salario = scanner.nextDouble();
            qtdFuncionarios++;
            total += salario;
        }
        Double media = total/qtdFuncionarios;
        System.out.println("A média salarial é de R$" + media);

        scanner.close();
    }
}
