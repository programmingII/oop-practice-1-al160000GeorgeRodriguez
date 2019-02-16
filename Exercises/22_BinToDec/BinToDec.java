
//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:35
//Hace: Binario a decimal.
import java.util.Scanner;

public class BinToDec {
    public static int conversion(int binario,int n) {                                                                                           
        if (binario > 0) {
            return ((binario%10)*n+conversion(binario/10,n*2)); // Se ocupa el indice para asignar la variable Hasta que ya no sea posible dividir
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Se inicializa la funcion que nos permite ingresar desde el teclado
        System.out.print("Ingrese un numero decimal: ");
        int decimal = in.nextInt();
        System.out.print("El numero decimal es : " + conversion(decimal,1)); // Se expresa el resultado
        in.close();
    }
}