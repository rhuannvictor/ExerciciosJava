import java.util.Arrays;
import java.util.List;

// Verifique se todos os números da lista são positivos e exiba o resultado no console.
public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros.stream()
                .allMatch(numero -> numero >= 0);

        String resultado = String.format
                ("Todos os números são positivos? %s", todosPositivos ? "Sim!" : "Não");
        System.out.println(resultado);
    }
}
