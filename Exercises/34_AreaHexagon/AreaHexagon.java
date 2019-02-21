
// Autor: George Rodríguez
// Fecha y hora: 18/2/2019 10:45
// Hace: Area de un hexagono.
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class AreaHexagon {
    public static double resultado(double apotema) {
        return (6 * (apotema * apotema)) / (4 * Math.tan(Math.PI / 6));
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Instancia la variable entrada
        System.out.println("Ingrese el area del hexagono: "); // Pide el ingreso
        double numero = entrada.nextDouble(); // Captura el ingrreso
        System.out.println("El area del hexagono es: " + resultado(numero) ); // Visualiza el resultado
    }
}