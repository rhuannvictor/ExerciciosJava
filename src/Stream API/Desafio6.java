import java.util.Arrays;
import java.util.List;

//Utilize a Stream API para verificar se a lista contém algum número maior que 10
// e exiba o resultado no console.
public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);

        /* IMPRIMINDO A LISTA DE NUMEROS MAIORES QUE 10

        List<Integer> maioresQue10 = numeros.stream()
                .filter(numero -> numero>10)
                .toList();
        if(maioresQue10.isEmpty()){
            System.out.println("Não há valores maiores que 10 na lista!");
        } else{
            System.out.println(maioresQue10);
        }*/

        //FAZENDO SOMENTE A VERIFICAÇÃO COM ANY.MATCH()

        boolean temMaiorQue10 = numeros.stream()
                .anyMatch(num -> num >10);
        if (temMaiorQue10) {
            System.out.println("A lista contém números maiores que 10!");
        } else {
            System.out.println("Não há valores maiores que 10 na lista!");
        }

    }
}
