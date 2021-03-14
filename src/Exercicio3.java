import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Digite o primeiro numero  :");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero  :");
        numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println("Primeiro numero é maior :"+ numero1);
            System.out.println("Segundo numero é menor :"+ numero2);
        } else if(numero2 > numero1) {    
                System.out.println("Segundo numero :"+ numero2);
                System.out.println("Primeiro numero é menor :"+ numero1);
             } else {
                 System.out.println("Numeros são iguais");

             }

        
    } 
}   
    