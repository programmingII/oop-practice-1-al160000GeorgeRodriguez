
// Autor: George Rodríguez
// Fecha y hora: 18/2/2019 15:45
// Hace: Superficie de la tierra.
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class EarthRadius {
    public static double resultado(double la1, double lo1, double la2, double lo2) {
        //Se devuelve la formula
        return (6371.01*Math.acos(Math.sin(Math.toRadians(la1))* Math.sin(Math.toRadians(la2))+ Math.cos(Math.toRadians(la1))* Math.cos(Math.toRadians(la2))* Math.cos(Math.toRadians(lo1)-Math.toRadians(lo2))));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Instancia la variable entrada
        System.out.println("Ingrese la latitud 1: "); // Pide el ingreso
        double la1 = entrada.nextDouble(); // Captura el ingreso
        System.out.println("Ingrese la longitud 1: "); // Pide el ingreso
        double lo1 = entrada.nextDouble(); // Captura el ingreso
        System.out.println("Ingrese la latitud 2: "); // Pide el ingreso
        double la2 = entrada.nextDouble(); // Captura el ingreso
        System.out.println("Ingrese la longitud 2: "); // Pide el ingreso
        double lo2 = entrada.nextDouble(); // Captura el ingreso
        System.out.println("La distancia entre esos puntos es: " + resultado(la1,lo1,la2,lo2)+" km"); // Visualiza el resultado
    }
}