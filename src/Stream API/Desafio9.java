import java.util.Arrays;
import java.util.List;

// Verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,5, 10,11);

        boolean temIgual = numeros.size() != numeros.stream().distinct().count();

        String resultado = String.format
                ("A lista tem números repetidos? %s", temIgual ? "Sim" : "Não");
        System.out.println(resultado);

    }
}
