import java.util.Arrays;
import java.util.List;

// Calcule a média dos números maiores que 5 e exiba o resultado no console.
public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQue5 = numeros.stream()
                .filter(numero -> numero>5)
                        .toList();

        double media = maioresQue5.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(media);
    }
}
