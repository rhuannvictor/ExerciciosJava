import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = 0, gasolina = 0, alcool = 0, diesel = 0;

        while(entrada != 4){
            System.out.println("Informe a opção desejada:");
            entrada = scanner.nextInt();
            if (entrada == 1) alcool++;
            else if (entrada == 2) gasolina++;
            else if (entrada == 3) diesel++;
            else System.out.println("Digite uma opção válida entre 1 e 4.");
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool:" + alcool);
        System.out.println("Gasolina:" + gasolina);
        System.out.println("Diesel:" + diesel);

        scanner.close();
    }
}
