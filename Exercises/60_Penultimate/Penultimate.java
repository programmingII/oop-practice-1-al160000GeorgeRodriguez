
// Autor: George Rodríguez
// Fecha y hora: 24/2/2019 15:29
// Hace: Convierte la penultima palabra
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

public class Penultimate {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Se instancia los objetos
        System.out.print("Ingresa una frase: "); // Se le pide al usuario su frase
        String MiLinea = entrada.nextLine(); /// Se ingresa la linea
        String[] palabra = MiLinea.split("[ ]+");// Se dividira con uno o mas espacios
        int indice = palabra.length - 2;// el penultimo elemento del arreglo
        System.out.println(palabra[indice]); // Se imprime la linea quitandole el principio y el final
    }
}