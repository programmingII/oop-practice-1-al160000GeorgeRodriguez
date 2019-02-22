// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 16:40
// Hace: Acepta un entero y procesa su valor n+nn+nnn
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola
class ThreeValues {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in); // Instancia la variable entrada
        System.out.println("Ingrese un numero: "); // Pide el ingreso
        int numero = entrada.nextInt(); //Se captura la entrada
        System.out.printf("%d + %d%d +%d%d%d",numero,numero,numero,numero,numero,numero);  //Se le da formato a la salida con la funcion printf
    }
}