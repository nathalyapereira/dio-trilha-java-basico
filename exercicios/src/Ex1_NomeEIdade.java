import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAlunos;
        int idadeAlunos;

        
        while(true) {
            System.out.println("Nome: ");
            nomeAlunos = scanner.next();
            
            if(nomeAlunos.equals("0")) break;

            System.out.println("Idade: ");
            idadeAlunos = scanner.nextInt();
            
        }
        System.out.println("ENCERRANDO...");
    }
}
