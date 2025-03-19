import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

// Realize a soma dos números pares da lista e exiba o resultado no console.
public class Desafio2 {
    public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // VERSÃO MAIS LONGA
    //___________________________________________________________________________
    /*Predicate <Integer> isPar = numero -> numero % 2 == 0;

    List <Integer> numerosPares = numeros.stream()
            .filter(isPar)
            .toList();

    BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

    int resultado = numerosPares.stream()
            .reduce(0,somar);*/
    //____________________________________________________________________________

    // VERSÃO REDUZIDA
    //____________________________________________________________________________

        int resultado = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .reduce(0,(num1, num2) -> num1 + num2);

        System.out.println("A soma dos números pares é:" + resultado);

    //____________________________________________________________________________
    }
}

