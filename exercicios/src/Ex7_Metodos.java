import java.util.Scanner;

public class Ex7_Metodos {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Escolha a operação desejada, digitando o seu respectivo número");
       System.out.println("Operação: \n1-Multiplicação\n2-Divisão\n3-Adição\n4-Subtração");
       int operacao = scanner.nextInt();
       
       int numero1;
       int numero2;
       boolean operacaoEValida = (operacao > 0 && operacao <= 4);

       if(operacaoEValida){
        System.out.println("1° Número: ");
        numero1 = scanner.nextInt();

        System.out.println("2° Número: ");
        numero2 = scanner.nextInt();
        
            if(operacao == 1 ){
                System.out.println("Resultado: " + multuplicar(numero1, numero2));
            }
            else if(operacao == 2 ){
                System.out.println("Resultado: " + dividir(numero1, numero2));
            }
            else if(operacao == 3 ){
                System.out.println("Resultado: " + somar(numero1, numero2));
            }
            else if(operacao == 4 ){
                System.out.println("Resultado: " + subtrair(numero1, numero2));
            }

        }else{
            System.out.println("Operação Inválida!");
            }
        
       
       
    }
       
    
     static int multuplicar(int numero1, int numero2) {
        return(numero1 * numero2); 
     }

     static double dividir(int numero1, int numero2) {
        return(numero1 / numero2); 
     }

     static int somar(int numero1, int numero2) {
        return(numero1 + numero2); 
     }

     static int subtrair(int numero1, int numero2) {
        return(numero1 - numero2); 
     }

}
