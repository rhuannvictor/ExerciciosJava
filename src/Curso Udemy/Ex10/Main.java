package Ex10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Retangulo retan = new Retangulo();

        System.out.println("Informe a largura e altura do retangulo:");
        retan.largura = scan.nextDouble();
        retan.altura = scan.nextDouble();

        System.out.printf("AREA = %.2f%n",retan.area());
        System.out.printf("PERIMETRO =  %.2f%n",retan.perimetro());
        System.out.printf("DIAGONAL = %.2f%n",retan.diagonal());

        scan.close();
    }
}
