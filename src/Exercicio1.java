import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       double altura,largura,area;

        System.out.println("Informe a Altura");
        altura = sc.nextDouble();
      //  System.out.println(altura);

        System.out.println("Informe a Largura");
        largura = sc.nextDouble();
        //System.out.println(largura);

        System.out.println("O valor da Area é");
        area = altura * largura;
        System.out.println(area);
    
    
    
    }
}
