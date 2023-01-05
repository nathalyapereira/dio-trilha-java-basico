import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scanner.nextInt();

        int multiplicao = 1;

        System.out.print(fatorial + "! = ");
        
        for(int i = fatorial; i >= 1; i--) {
            multiplicao *= i;
        }

        System.out.println(multiplicao);
    }
}
