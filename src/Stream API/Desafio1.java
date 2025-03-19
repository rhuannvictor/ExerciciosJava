import java.util.Arrays;
import java.util.List;

// Ordene a lista de números em ordem crescente e a exiba no console.

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosCrescentes = numeros.stream()
                .sorted()
                .toList();
        System.out.println(numerosCrescentes);
}
}