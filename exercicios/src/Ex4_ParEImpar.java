import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros;
        int quantidadeNumeros;
        int count = 0;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Digite a quantidade números que deseja inserir: ");
        quantidadeNumeros = scanner.nextInt();

        do{
            System.out.println("Número: ");
            numeros = scanner.nextInt();
            
            if(numeros % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;

        }while(count < quantidadeNumeros);

        System.out.println("Quantidade de par: " + quantidadePares);
        System.out.println("Quantidade de impar: " + quantidadeImpares);

    }
}
