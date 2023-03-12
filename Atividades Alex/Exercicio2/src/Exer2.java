import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Float n1,n2,mais,vezes,dividido,menos;
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        n1 = Ler.nextFloat();
        System.out.print("Digite o valor 2: ");
        n2 = Ler.nextFloat();
        mais = n1 + n2;
        menos = n1 - n2;
        vezes = n1 * n2;
        dividido = n1 / n2;
        System.out.println("Resultados: \n "+ "soma: "+mais + "\n"+"Subtração: "+ menos + "\n" + "Multiplicação: "+ vezes + "\n" + "Divisão: "+ dividido + "\n");
    }
}
