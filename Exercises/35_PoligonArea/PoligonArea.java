
// Autor: George Rodríguez
// Fecha y hora: 18/2/2019 15:45
// Hace: Area de un poligono.
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class PoligonArea {
    public static double resultado(double n,double s) {
        return ((n * s * s) / (4 * Math.tan(Math.PI/ n)));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Instancia la variable entrada
        System.out.println("Ingrese el numero de caras del poligono: "); // Pide el ingreso
        double n = entrada.nextDouble(); // Captura el ingreso
        System.out.println("Ingrese la longitud de la arista del poligono: "); // Pide el ingreso
        double s = entrada.nextDouble(); // Captura el ingreso
        System.out.println("El area del hexagono es: " + resultado(n,s)); // Visualiza el resultado
    }
}