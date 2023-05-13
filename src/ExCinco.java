import java.util.ArrayList;
import java.util.List;
public class ExCinco {
    public static void main(String[] args) {
        criandoVetor();
        transformandoVetorInteiroEmString();
        quebrandoSomandoOsNumeros();

        System.out.println("Os números cuja a soma de todos os dígitos é um número par são: ");
        System.out.println(somaDosNumeros);
    }
    public static int vetorNumerosEntreCemCentoCinquenta[] = new int[51];
    public static void criandoVetor() {
        int numeroDoPrimeiroVetor = 100;

        for (int i = 0; i < 51; i++) {
            vetorNumerosEntreCemCentoCinquenta[i] = numeroDoPrimeiroVetor;
            numeroDoPrimeiroVetor++;
        }
    }
    public static String vetorNumeroTipoString[] = new String[vetorNumerosEntreCemCentoCinquenta.length];
    public static void transformandoVetorInteiroEmString() {
        for (int i = 0; i < vetorNumeroTipoString.length; i++) {
            vetorNumeroTipoString[i] = String.valueOf(vetorNumerosEntreCemCentoCinquenta[i]);
        }
    }
    public static List<Integer> somaDosNumeros = new ArrayList<>();
    public static void quebrandoSomandoOsNumeros() {
        for (int i = 0; i < vetorNumeroTipoString.length; i++) {
            String[] quebraDosNumeros = vetorNumeroTipoString[i].split("");
            List<Integer> listaNumerosQuebrados = new ArrayList<>();

            for (int j = 0; j < quebraDosNumeros.length; j++) {
                listaNumerosQuebrados.add(Integer.parseInt(quebraDosNumeros[j]));
            }

            int soma = 0;

            for (int h = 0; h < listaNumerosQuebrados.size(); h++) {
                soma += listaNumerosQuebrados.get(h);
            }
            if (soma % 2 == 0){
                somaDosNumeros.add(Integer.valueOf(vetorNumeroTipoString[i]));
            }
        }
    }
}