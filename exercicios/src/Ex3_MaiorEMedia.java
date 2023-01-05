import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numeroMaior = 0;
        int count = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            soma += numero; 
            
            if(numero > numeroMaior) numeroMaior = numero;
            
            count++;
            
        } while(count < 5) ;
        
        System.out.println("Maior: " + numeroMaior);
        System.out.println("Soma: " + (soma/5
        ));
        

    }
}
