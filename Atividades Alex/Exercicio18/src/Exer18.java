import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        for (int i = 0; i <= 75; i++) {
            System.out.print("");
            System.out.print("Digite a idade: ");
            Integer idade = Ler.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade!");
            } else if (idade < 18) {
                System.out.println("Menor de idade!");
            }
        }
    }
}

