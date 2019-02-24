// Autor: George Rodríguez
// Fecha y hora: 22/2/2019 19:29
// Hace: Coloca la primera letra en mayuscula
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola
public class CapitalizeLetter {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // Se instancia los objetos
        System.out.print("Ingresa una frase: "); //Se le pide al usuario su frase
        String MiLinea = entrada.nextLine();   ///Se ingresa la linea
        String lineaPrincipal = ""; //Al procesar la linea ingresada se guardará aqui
        Scanner lineScan = new Scanner(MiLinea);  //Se instancia con la linea ingresada
        while (lineScan.hasNext()) {   // hasta el final de la linea
            String frase = lineScan.next();  // Se obtine la siguiente frase
            lineaPrincipal += Character.toUpperCase(frase.charAt(0)) + frase.substring(1) + " ";  //Se agregan las palabras al texto final
        }
        System.out.println(lineaPrincipal.trim()); //Se imprime la linea
    }
}