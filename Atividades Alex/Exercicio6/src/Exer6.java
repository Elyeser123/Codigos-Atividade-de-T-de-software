import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Float valorA,valorB,n_valorA,n_valorB;
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite o valor A: ");
        valorA = Ler.nextFloat();
        System.out.print("Digite o valor B: ");
        valorB = Ler.nextFloat();
        n_valorB = valorA;
        n_valorA = valorB;
        System.out.println("Valor A trocado pelo B: "+n_valorA+"\n"+"Valor B trocado pelo A: "+ n_valorB );
    }
}
