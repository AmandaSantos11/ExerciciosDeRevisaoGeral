import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExUm {
    public static Scanner digite = new Scanner(System.in);
    public static List<Integer> listaDeSexoFeminino = new ArrayList<>();
    public static List<Integer> listaDeSexoMasculino = new ArrayList<>();
    public static List<Double> listaAlturaFeminino = new ArrayList<>();
    public static List<Double> listaAlturaMasculino = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            receberInformacaoDoUsuario();
        }
        menorMaiorAlturaFeminino();
        menorMaiorAlturaMasculino();
        maiorAlturaDoGrupo();
        menorAlturaDoGrupo();
        mediaAlturaMasculino();
        quantidadeDeFeminino();
    }
    public static int qtdFeminino;
    public static void receberInformacaoDoUsuario() {
        System.out.println("Digite o seu sexo: ");
        System.out.println("1-Feminino | 2-Masculino");
        int sexoDoUsuario = digite.nextInt();

        switch (sexoDoUsuario) {
            case 1:
                listaDeSexoFeminino.add(sexoDoUsuario);
                pedirAlturaFeminino();
                qtdFeminino++;
                break;

            case 2:
                listaDeSexoMasculino.add(sexoDoUsuario);
                pedirAlturaMasculino();
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
    public static void pedirAlturaFeminino() {
        System.out.println("Digite sua altura: ");
        listaAlturaFeminino.add(digite.nextDouble());
    }
    public static void pedirAlturaMasculino() {
        System.out.println("Digite sua altura: ");
        listaAlturaMasculino.add(digite.nextDouble());
    }
    public static double maiorAlturaFeminino = 0000;
    public static double menorAlturaFeminino = 9999;
    public static void menorMaiorAlturaFeminino() {
        //MAIOR altura feminino
        for (int i = 0; i < listaAlturaFeminino.size(); i++) {
            if (listaAlturaFeminino.get(i) > maiorAlturaFeminino) {
                maiorAlturaFeminino = listaAlturaFeminino.get(i);
            }
        }
        //MENOR altura feminino
        for (int i = 0; i < listaAlturaFeminino.size(); i++) {
            if (listaAlturaFeminino.get(i) < menorAlturaFeminino) {
                menorAlturaFeminino = listaAlturaFeminino.get(i);
            }
        }
    }
    public static double maiorAlturaMasculino = 0000;
    public static double menorAlturaMasculino = 9999;
    public static void menorMaiorAlturaMasculino() {
        //MAIOR altura masculino
        for (int i = 0; i < listaAlturaMasculino.size(); i++) {
            if (listaAlturaMasculino.get(i) > maiorAlturaMasculino) {
                maiorAlturaMasculino = listaAlturaMasculino.get(i);
            }
        }
        //MENOR altura masculino
        for (int i = 0; i < listaAlturaMasculino.size(); i++) {
            if (listaAlturaMasculino.get(i) < menorAlturaMasculino) {
                menorAlturaMasculino = listaAlturaMasculino.get(i);
            }
        }
    }
    public static void maiorAlturaDoGrupo() {
        DecimalFormat formatoMaiorAltura = new DecimalFormat("0.00");

        if (maiorAlturaFeminino > maiorAlturaMasculino) {
            System.out.println("A maior altura do grupo é: " + formatoMaiorAltura.format(maiorAlturaFeminino));
        } else {
            System.out.println("A maior altura do grupo é: " + formatoMaiorAltura.format(maiorAlturaMasculino));
        }
    }
    public static void menorAlturaDoGrupo() {
        DecimalFormat formatoMenorAltura = new DecimalFormat("0.00");

        if (menorAlturaFeminino < menorAlturaMasculino) {
            System.out.println("A menor altura do grupo é: " + formatoMenorAltura.format(menorAlturaFeminino));
        } else {
            System.out.println("A menor altura do grupo é: " + formatoMenorAltura.format(menorAlturaMasculino));
        }
    }
    public static void mediaAlturaMasculino() {
        double somaAlturaMasculino = 0;

        for (int i = 0; i < listaAlturaMasculino.size(); i++) {
            somaAlturaMasculino += listaAlturaMasculino.get(i);
        }

        DecimalFormat formatoMedia = new DecimalFormat("0.00");

        double mediaAlturaMasculino;
        mediaAlturaMasculino = somaAlturaMasculino / listaAlturaMasculino.size();
        System.out.println("A média das alturas masculinas é: "+ formatoMedia.format(mediaAlturaMasculino));
    }
    public static void quantidadeDeFeminino (){
        if (qtdFeminino == 10){
            System.out.println("A quantidade de mulheres é: "+qtdFeminino);
        }
        else{
            System.out.println("A quantidade de mulheres é: "+qtdFeminino);
        }
    }
}