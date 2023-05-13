import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExDois {
    public static Scanner digite = new Scanner(System.in);
    public static List<Double> salarioDosFuncionarios = new ArrayList<>();
    public static void main(String[] args) {
        quantidadeDeFuncionarios();
        mediaDosSalarios();
    }
    public static void quantidadeDeFuncionarios(){
        System.out.println("Qual a grade de funcionários: ");
        int quantidadeDeFuncionario = digite.nextInt();

        for (int i = 0; i < quantidadeDeFuncionario; i++) {

            System.out.println("Digite o salário do "+(i+1)+" funcionário: ");
            salarioDosFuncionarios.add(digite.nextDouble());
        }
    }
    public static void mediaDosSalarios(){
        double somaDosSalario=0;

        for (int i = 0; i < salarioDosFuncionarios.size(); i++) {
            somaDosSalario += salarioDosFuncionarios.get(i);
        }
        double media;
        media = somaDosSalario / salarioDosFuncionarios.size();

        NumberFormat real = NumberFormat.getCurrencyInstance();
        String mediaComReal = real.format(media);

        System.out.println("------------------------------");
        System.out.println("A média dos salários é de: "+mediaComReal);
    }
}