import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Float dolar,c_dol,real;
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite quantos dólars possui: ");
        dolar = Ler.nextFloat();
        System.out.print("Digite a cotaçao atual do dólar: ");
        c_dol = Ler.nextFloat();
        real= dolar * c_dol;
        System.out.print("O valor em reais é igual : "+ " R$"+real);
    }
}
