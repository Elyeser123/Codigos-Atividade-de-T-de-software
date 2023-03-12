import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
       Double custo_f,custo_c,imp,destri;
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do carro: ");
        custo_f = Ler.nextDouble();
        imp = custo_f * 0.45;
        destri = custo_f * 0.28;
        custo_c = custo_f + destri+imp;
        System.out.print("O custo ao consumidor é de: "+ custo_c);

    }
}
