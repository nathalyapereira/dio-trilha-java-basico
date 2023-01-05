package retornos;

public class Main {

    public static void main(String[] args) {
       
        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(4d,6d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,4,2);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
    
}
