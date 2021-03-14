import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);   
        int idade; 
    System.out.println("Informe a idadade :");
    idade =sc.nextInt();
    
    if(idade <= 13){
        System.out.println("Criança");
    }   else if ( idade <= 18 ){
            System.out.println("Adolecente !");
                }else if (idade <= 60) {
                    System.out.println("idoso");
                    } else {
                        System.out.println("idoso");
     }
        
}
    }