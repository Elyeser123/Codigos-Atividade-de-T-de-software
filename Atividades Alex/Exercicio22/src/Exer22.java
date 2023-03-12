import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        Double media = 0.0,preco = 0.0,precov = 0.0,media_v = 0.0;
        for (int i = 1; i <= 40; i++) {
            System.out.print("Digite o preço de custo do produto: ");
             preco = Ler.nextDouble();
            System.out.print("Digite o preço de venda do produto: ");
             precov = Ler.nextDouble();
            if (precov > preco) {
                System.out.println("Houve Lucro");
            }
            if (preco > precov) {
                System.out.println("Houve Prejuizo");
            } else if (preco.equals(precov)) {
                System.out.println("Empate");
            }
                media += (preco ) / 40;
                media_v += (precov)/40;
            }
        System.out.println("Média do preço de custo foi de: "+media+"\n"+ "Média do preço de venda foi de: "+media_v);
     }

    }

