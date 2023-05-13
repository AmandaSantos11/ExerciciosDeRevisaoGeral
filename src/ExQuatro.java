import java.util.Scanner;
public class ExQuatro {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        String numeroInvertido = "";

        System.out.println("Digite um número");
        String numeroDigitado = digite.next();

        for(int i = (numeroDigitado.length() - 1); i >= 0; i--){
            numeroInvertido += numeroDigitado.charAt(i);
        }
        System.out.println("O número "+numeroDigitado+" de forma inversa é: "+numeroInvertido);
    }
}

