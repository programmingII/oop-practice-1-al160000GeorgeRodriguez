
//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:45
//Hace: Hexadecimal a octal.
import java.util.Scanner; //Se importa la librería Scanner para el ingreso desde el teclado

public class HexToOct {
    public static int busqueda(char x, int i) {
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' }; // Matriz de
                                                                                                         // apoyo
        if (hex[i] != x) { // compara el valor dado con el del arreglo
            return (busqueda(x, i + 1));
        } else {
            return i;// devuelve el indice
        }
    }

    public static int conversionHB(String hex_num, int i,int j) // Función recursiva original
    {
        char hex = hex_num.charAt(hex_num.length() - i);
        int[] hex_numvalues = { 0, 1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111 }; // Matriz de datos principal
        if ((hex_num.length() - i) != 0) {
            return (hex_numvalues[busqueda(hex, 0)] * j + conversionHB(hex_num, i + 1, j * 10000)); // Se genera la función recursiva
        } else {
            return hex_numvalues[busqueda(hex, 0)] * j;
        }
    }
    
    public static int conversion(int binario, int n) {
        if (binario > 0) {// Se ocupa el indice para asignar la variable Hasta que ya no sea posible dividir
            return ((binario % 10) * n + conversion(binario / 10, n * 2));
        } else {
            return 0;
        }
    }
    public static String conversionBO(int binario) {
        char oct[] = { '0', '1', '2', '3', '4', '5', '6', '7' }; // Se asignan los posibles resultados de la operacion a indices de una matriz
        if (binario > 0) {
            // System.out.println("Entra al if" + Character.toString(oct[binario % 1000]));
            return (conversionBO(binario / 1000) + oct[conversion(binario % 1000, 1)]); // Se ocupa el indice para
                                                                                        // asignar la variable Hasta que
                                                                                        // ya no sea posible dividir
        } else {
            return ("");
        }
    }

    public static void main(String[] args) { // Función principal
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número en hexadecimal: "); // Se le solicita al usuario un número para conversión
        String hex_num = in.nextLine(); // Se ingrsan los datos desde el teclado
        System.out.print("El equivalente octal es: " + conversionBO(conversionHB(hex_num.toUpperCase(), 1,1))); // Se exhibe el
                                                                                                // resultado
    }
}