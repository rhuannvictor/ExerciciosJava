import java.util.Arrays;
import java.util.List;

// Agrupe os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);

        List<Integer> imparesMultiplos= numeros.stream()
                .filter(num -> num % 2 != 0)
                .filter(num -> num % 3 == 0 || num % 5 ==0)
                .toList();
        System.out.println(imparesMultiplos);

    }
}
