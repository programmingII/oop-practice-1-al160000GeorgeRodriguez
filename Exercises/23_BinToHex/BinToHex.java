
//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:55
//Hace: Binario a hexadecimal.
import java.util.Scanner;

public class BinToHex {
    public static int conversion(int binario, int n) {
        if (binario > 0) {
            // Se ocupa el indice para asignar la variable Hasta que ya no sea posible
            // dividir
            return ((binario % 10) * n + conversion(binario / 10, n * 2));
        } else {
            return 0;
        }
    }

    public static String conversionBO(int binario) {
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7','8','9','A','B','C','D','E','F'}; // Se asignan los posibles resultados de la operacion a
                                                                 // los
                                                                 // indices de una matriz
        if (binario > 0) {
            // System.out.println("Entra al if" + Character.toString(oct[binario % 1000]));
            return (conversionBO(binario / 10000) + hex[conversion(binario % 10000, 1)]); // Se ocupa el indice para
                                                                                        // asignar la variable Hasta que
                                                                                        // ya no sea posible dividir
        } else {
            return ("");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Se inicializa la funcion que nos permite ingresar desde el teclado
        System.out.print("Ingrese un numero decimal: ");
        int decimal = in.nextInt();

        System.out.print("El numero octal es : " + conversionBO(decimal)); // Se expresa el resultado
        in.close();
    }
}