import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] meses = {"x", "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número referente ao mês desejado");
        int escolha = scanner.nextInt();

        boolean isValid = (escolha > 0 && escolha <= 12);

       if(isValid) { 

        System.out.println(meses[escolha]);

            if(escolha == 1 || escolha == 7 || escolha == 12) {
                System.out.println("Você sabia que " + meses[escolha] + " é um mês de Férias!");
            }
        }else {
            System.out.println("Inválido");
        }
    }
}
