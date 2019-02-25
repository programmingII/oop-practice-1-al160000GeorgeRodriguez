
// Autor: George Rodríguez
// Fecha y hora: 24/2/2019 14:29
// Hace: Convierte la frase en minuscula
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

public class Lowercase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Se instancia los objetos
        System.out.print("Ingresa una frase: "); // Se le pide al usuario su frase
        String MiLinea = entrada.nextLine(); /// Se ingresa la linea
        System.out.println(MiLinea.toLowerCase()); // Se imprime la linea quitandole el principio y el final
    }
}