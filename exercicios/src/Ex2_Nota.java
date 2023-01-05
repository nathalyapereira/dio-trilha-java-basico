import java.util.Scanner;

public class Ex2_Nota {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma nota de zero a dez ");
        int nota = scanner.nextInt();

        boolean isValid = nota >= 0 && nota <= 10;

        while(!isValid) {
            System.out.println("Nota inválida!");

            System.out.println("Digite uma nota de zero a dez ");
            nota = scanner.nextInt();
        }

        
    }
}
