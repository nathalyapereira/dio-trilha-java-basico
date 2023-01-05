import java.util.Scanner;

public class Ex8_HoraDoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horario;

        System.out.println("Horário: ");
        horario = scanner.nextDouble();

        falar(horario);
        
    }
    public static void falar(Double horario) {
        boolean manha = (horario >= 1 && horario <= 11);
        boolean tarde = (horario >= 12 && horario <= 18);
        boolean noite = (horario >= 19 && (horario <= 24 | horario == 0));

        if(manha){
            System.out.println("Bom dia!");
        }else if(tarde){
            System.out.println("Boa tarde!");
        }else if(noite){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Ei\nO dia só tem 24 horas!");
        }
    }
}
