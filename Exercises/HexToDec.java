
//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:45
//Hace: octal a decimal.
import java.util.Scanner; //Se importa la librería Scanner para el ingreso desde el teclado

public class OctToDec {
    public static long conversion(long hex_num, int i) // Función recursiva original
    {
        if (hex_num != 0) {
            return ((long) ((hex_num % 10) * Math.pow(16, i)) + conversion(hex_num / 10, i + 1)); // Se genera la
                                                                                                     // función
                                                                                                     // recursiva
        } else {
            return 0;
        }
    }

    public static void main(String[] args) { // Función principal
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número en octal: "); // Se le solicita al usuario un número para conversión
        long hex_num = in.nextLong(); // Se ingrsan los datos desde el teclado
        System.out.print("Equivalent decimal number: " + conversion(hex_num, 0)); // Se exhibe el resultado
    }
}