import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabuada;
        int count = 0;

        System.out.println("Tabuda de: ");
        tabuada = scanner.nextInt();

        
        
        System.out.println("Tabuada de "+ tabuada);

        do{
            int multiplicao = tabuada * count;
            System.out.println("- "+ tabuada +" x "+ count + " = " + multiplicao);
            count++;
            
        }while(count <= 10);
    }
}
