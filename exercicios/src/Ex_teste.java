import java.util.Scanner;

public class Ex_teste {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velocidade: ");
        int velocidadeAtual = scanner.nextInt();
        
        
        if(velocidadeAtual <= 60){
            System.out.println( "Nao foi multado");
        } else {
            System.out.println("Foi multado");
        }
        

    }
    
}
