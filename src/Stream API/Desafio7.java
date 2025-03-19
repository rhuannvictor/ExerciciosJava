import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Encontre o segundo número maior da lista e exiba o resultado no console.
public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);

        List<Integer> distintosOrdenados = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        if (distintosOrdenados.size() < 2) {
            System.out.println("Não há um segundo maior número na lista.");
        } else {
            System.out.println("O segundo maior número é: " + distintosOrdenados.get(1));
        }
    }
}
