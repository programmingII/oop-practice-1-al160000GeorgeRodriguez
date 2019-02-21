
//Autor: George Rodríguez
//Fecha y hora: 19/2/2019 10:45
//Hace: Hexadecimal a binario.
import java.util.Scanner; //Se importa la librería Scanner para el ingreso desde el teclado

public class HexToBin {
    public static int busqueda(char x, int i) {
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' }; // Matriz de apoyo 
        if (hex[i] != x) { // compara el valor dado con el del arreglo
            return (busqueda(x, i + 1));
        } else {
            return i;// devuelve el indice
        }
    }

    public static long conversion(String hex_num, int i,int j) // Función recursiva original
    {
        char hex = hex_num.charAt(hex_num.length()-i);
        int[] hex_numvalues = { 0, 1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111 }; // Matriz de datos principal
        if ((hex_num.length() - i) != 0) {
            return (hex_numvalues[busqueda(hex, 0)] * j + conversion(hex_num, i+1,j * 10000)); // Se genera la función recursiva
        } else {
            return hex_numvalues[busqueda(hex, 0)] * j;
        }
    }
    public static void main(String[] args) { // Función principal
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número en hexadecimal: "); // Se le solicita al usuario un número para conversión
        String hex_num = in.nextLine(); // Se ingrsan los datos desde el teclado
        System.out.print("El equivalente binario es: " + conversion(hex_num.toUpperCase(), 1,1)); // Se exhibe el
                                                                                                // resultado
    }
}