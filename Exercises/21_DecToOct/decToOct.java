
//Autor: George Rodríguez
//Fecha y hora: 14/2/2019 12:35
//Hace: Decimal a hexadecimal.
import java.util.Scanner;

public class decToOct {
    public static String conversion(int decimal) {
        char dec[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8' }; 
        int indice; // se declara la variable para numero ingresado y el indice del arreglo
        indice = decimal % 8; // se saca el modulo
        if (decimal > 0) {
            return (conversion(decimal/8) + dec[indice]); // Se ocupa el indice para asignar la variable Hasta que ya
                                                             // no sea posible dividir
        } else {
            return ("");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Se inicializa la funcion que nos permite ingresar desde el teclado
        System.out.print("Ingrese un numero decimal: ");
        int decimal = in.nextInt();
        System.out.print("El numero octal es : " + conversion(decimal)); // Se expresa el resultado
        in.close();
    }
}