import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Remova os valores ímpares da lista e imprima a lista resultante no console.
public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        /* USANDO UMA LISTA EXTERNA
        List<Integer> numerosImpares = numeros.stream()
                .filter(numero -> numero %2 != 0)
                .toList();

        numeros.removeAll(numerosImpares);     */

        //USANDO REMOVEIF
        numeros.removeIf(numero -> numero % 2 != 0);
        System.out.println(numeros);
    }
}
