import java.util.Arrays;
import java.util.List;

// Encontre a soma dos quadrados de todos os números da lista
public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);

        int resultado = numeros.stream()
                .mapToInt(Integer::intValue)
                .map(num -> num * num)
                .sum();

        System.out.println("A soma dos quadrados é: " + resultado);
    }
}
