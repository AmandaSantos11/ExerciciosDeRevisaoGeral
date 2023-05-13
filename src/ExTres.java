import java.util.Scanner;
public class ExTres {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDigitado = digite.nextInt();

        if (numeroDigitado % 5 == 0 && numeroDigitado % 7 == 0){
            System.out.println("O número "+numeroDigitado+" é múltiplo de 5 e 7");
        }
        else if (numeroDigitado % 5 ==0) {
            System.out.println("O número "+numeroDigitado+" é múltiplo de 5");
        }
        else if (numeroDigitado % 7 ==0) {
            System.out.println("O número "+numeroDigitado+" é múltiplo de 7");
        }
        else {
            System.out.println("O número "+numeroDigitado+" não é múltiplo de 5 e nem de 7");
        }
    }
}