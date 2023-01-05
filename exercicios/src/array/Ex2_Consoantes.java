package array;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        String[] consoates = new String[6];
        int quantidadeCosoates = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = scanner.next();

            if(!(letra.equalsIgnoreCase("a")| 
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u"))
             ) {
                consoates[count] = letra;
                quantidadeCosoates++;
             }

             count++;

        } while(count < consoates.length);

        System.out.print("Consoante: ");
        for (String consoate : consoates) {
            if(consoate != null)
            System.out.print(consoate + " ");
        }
        System.out.print("\nQuantidades de consoantes: " + quantidadeCosoates);
    }
}
