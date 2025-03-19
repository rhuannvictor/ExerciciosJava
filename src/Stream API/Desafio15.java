import java.util.Arrays;
import java.util.List;

// Verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2,-3 ,3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean temNegativo = numeros.stream().anyMatch(num -> num <0);

        String resultado = String.format
                ("Tem algum número negativo na lista? %s", temNegativo ? "Sim" : "Não");
        System.out.println(resultado);
    }
}
