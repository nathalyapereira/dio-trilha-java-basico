import java.util.Scanner;

public class Ex9_Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorEmprestimo;
        double juros;
        int parcela;
        


        System.out.println("Valor do emprestimo: ");
        valorEmprestimo = scanner.nextDouble();

        System.out.println("Juros da parcela do cliente: ");
        juros = scanner.nextDouble();

        System.out.println("Quantidade de parcela(s): ");
        parcela = scanner.nextInt();
        

        if(valorEmprestimo > 0){
            
            jurosEmprestimoParcela(valorEmprestimo, juros,  parcela);
        }

    }

    
    public static void  jurosEmprestimoParcela(Double valorEmprestimo, Double juros, int parcela) {
        double jurosEmprestimo = (juros/100);
        double resultado = (valorEmprestimo * jurosEmprestimo * parcela);

        System.out.println(resultado);
    }
}
