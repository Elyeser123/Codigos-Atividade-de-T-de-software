import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        String nome;
        Float sal,sal_f,t_vendas,comissao;
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite nome: ");
        nome = Ler.nextLine();
        System.out.print("Digite o Salário Fixo: ");
        sal = Ler.nextFloat();
        System.out.print("Digite o total de vendas no mês, em dinheiro: ");
        t_vendas = Ler.nextFloat();
        comissao = (15 * t_vendas)/100;
        sal_f = sal + comissao;
        System.out.println("Nome: "+ nome+"\n" +"Salário Fixo: "+ sal+ "\n" + "Salário com a comissão: "+ sal_f );
    }
}
