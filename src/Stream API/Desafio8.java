import java.util.Arrays;
import java.util.List;

//Realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,12,11,5);

        int somaDosDigitos = numeros.stream()
                .flatMap(num->String.valueOf(num).chars().mapToObj(c->c - '0'))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaDosDigitos);

    }
}
