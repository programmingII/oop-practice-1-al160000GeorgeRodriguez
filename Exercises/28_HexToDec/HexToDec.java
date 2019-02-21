
//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:45
//Hace: Hexadecimal a decimal.
import java.util.Scanner; //Se importa la librería Scanner para el ingreso desde el teclado

public class HexToDec {
    public static int busqueda(char x, int i){
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };  //Matriz de apoyo
                if(hex[i]!=x){   //compara el valor dado con el del arreglo
            return (busqueda(x, i + 1));
        } else {
            return i;//devuelve el indice
        } 
                }
    public static long conversion(String hex_num, int i) // Función recursiva original
    {
        char hex = hex_num.charAt(i);
        if (hex_num.length() !=(i+1)) {
            return ((long) (busqueda(hex,0) * Math.pow(16, hex_num.length()-i-1)) + conversion(hex_num, i + 1)); // Se genera la función recursiva                                                               
        } else {
            return (long)(busqueda(hex, 0) * Math.pow(16, hex_num.length() - i - 1)); // Si la longitud es uno se devuelve el valor
        }
    }

    public static void main(String[] args) { // Función principal
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número en hexadecimal: "); // Se le solicita al usuario un número para conversión
        String hex_num = in.nextLine(); // Se ingrsan los datos desde el teclado
        System.out.print("El equivalente decimal es: " + conversion(hex_num.toUpperCase(), 0)); // Se exhibe el resultado
    }
}