import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        Integer numd;
        System.out.print("Quantos numeros deseja digitar: ");
        numd = Ler.nextInt();
        for (int i = 1; i <= numd; i++){
            System.out.print("Digite um numero qualquer: ");
            int num = Ler.nextInt();
            if (num > 0 ){
                System.out.println("Este numero é Positivo");
                System.out.println();
            } if (num == 0){
                System.out.println("Este numero é Igual á zero");
                System.out.println();
            } if(num < 0){
                System.out.println("Este numero é Negativo");
                System.out.println();
            }
        }
    }
}
