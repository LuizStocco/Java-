import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final double VALOR_DOLAR = 5.67,VALOR_EURO = 6.76,VALOR_PESO = 0.6;
        double real , dolar , euro ,peso ;
        System.out.println("Informe o valor do Real (R$)" );
        real = sc.nextDouble();
        dolar = real / VALOR_DOLAR;
        euro = real / VALOR_EURO;
        peso = real / VALOR_PESO;

        System.out.println("Dolar" + dolar);
        System.out.println("Euro" + euro);
        System.out.println("Peso Argentino " + peso);
}




}