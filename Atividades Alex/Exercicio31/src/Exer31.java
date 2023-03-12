import java.util.Scanner;

public class Exer31 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        Integer v1, v2, v3;
        System.out.println("Digite o valor 1: ");
        v1 = Ler.nextInt();
        System.out.println("Digite o valor 2: ");
        v2 = Ler.nextInt();
        System.out.println("Digite o valor 3: ");
        v3 = Ler.nextInt();
        if (v1 > v2 && v2 > v3) {
            System.out.println(v3 + " " + v2 + " " + v1);
        }
        if (v2 > v1 && v1 > v3) {
            System.out.println(v3 + " " + v1 + " " + v2);
        }
        if (v3 > v1 && v1 > v2) {
            System.out.println(v2 + " " + v1 + " " + v3);
        }
        if (v1 > v3 && v3 > v2) {
            System.out.println(v2 + " " + v3 + " " + v1);
        }
        if (v3 > v2 && v2 > v1) {
            System.out.println(v1 + " " + v2 + " " + v3);
        }
        if (v2 > v3 && v3 > v1) {
            System.out.println(v1 + " " + v3 + " " + v2);

        }
    }
}

