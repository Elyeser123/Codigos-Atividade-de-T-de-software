import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Double v_desc = 0.0,v_pagar = 0.0;
        Integer total = 0,total2 = 0;
        Scanner Ler = new Scanner(System.in);
        String answer = "";
        do{
            System.out.print("Digite o ano do veiculo: ");
            Integer ano_veic = Ler.nextInt();
            System.out.print("Digite o Valor do veiculo: ");
            Float valor = Ler.nextFloat();
            if ( ano_veic <= 2000){
                v_desc = valor * 0.12;
               v_pagar = valor - v_desc;
                System.out.println("O valor do desconto é de: "+ v_desc+"\n"+ "Valor a pagar, com desconto: "+v_pagar+"\n");
            }
            if (ano_veic > 2000){
                v_desc = valor * 0.07;
                v_pagar =  valor - v_desc;
                System.out.println("O valor do desconto é de: "+ v_desc+"\n"+ "Valor a pagar, com desconto: "+v_pagar+"\n");
            }
                if (ano_veic <= 2000) {
                    total += 1 ;
                } if (ano_veic != 0){
                    total2 = total2 + 1;
                }

            System.out.println("Deseja continuar: (sim/nao)?");
            answer = Ler.next();
            System.out.println();
        }while (answer.equalsIgnoreCase("sim"));
        System.out.println("Total de carros digitados com ano de ate 2000: " +total +"\n"+"Total da quantidade de carros digitados: " +total2);
    }
}
