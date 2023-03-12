import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite Valor 1: ");
        Integer valor1 = Ler.nextInt();
        System.out.print("Digite Valor 2: ");
        Integer valor2 = Ler.nextInt();
        if (valor1 > valor2) {
            System.out.print("O maior valor digitado foi: " + valor1);
        }
            else {
            System.out.print("O maior valor digitado foi: "+ valor2);
        }
    }
}
