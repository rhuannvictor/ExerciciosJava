import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Encontre o maior número primo da lista e exiba o resultado no console.
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14::ehPrimo)
                .max(Integer::compareTo);
        System.out.println("Maior número primo: " + maiorPrimo.orElse(0));


    }
    private static boolean ehPrimo (int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
