import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Float valor,presta;
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        valor = Ler.nextFloat();
        presta = valor /5;
        System.out.print("O valor em 5 prestações sem juros: "+ presta);

    }
}
