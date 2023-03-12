import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Calculo da media do aluno");
        System.out.println("Digite nome do aluno: ");
        String nome = Ler.nextLine();
        System.out.print("Digite nota 1: ");
        Float n1 = Ler.nextFloat();
        System.out.print("Digite nota 2: ");
        Float n2 = Ler.nextFloat();
        System.out.print("Digite nota 3: ");
        Float n3 = Ler.nextFloat();
        Float media = (n1 + n2 + n3 )/3;
         if (media >= 7) {
             System.out.println(nome+ " Parábens Você foi Aprovado "+ ", Sua media foi: "+ media);
         } else if (media <= 5) {
             System.out.println(nome+ " Você foi Reprovado "+ ", Sua media foi: "+ media);
         } else if (media >5 && media <7) {
             System.out.println(nome+ " Você está em Recuperação "+ ", Sua media foi: "+ media);
         }

    }
}
