import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExSeis {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        List<Integer> numerosDigitados = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número: ");
            numerosDigitados.add(digite.nextInt());
        }

        int somaDosNumeros = 0;

        for (int i = 0; i < numerosDigitados.size(); i++) {
            somaDosNumeros += numerosDigitados.get(i);
        }
        System.out.println("A soma dos 20 números é: "+somaDosNumeros);
    }
}
