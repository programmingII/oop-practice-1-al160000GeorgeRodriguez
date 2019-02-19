
//Autor: George Rodríguez
//Fecha y hora: 17/2/2019 12:45
//Hace: octal a decimal.
import java.util.Scanner; //Se importa la librería Scanner para el ingreso desde el teclado

public class OctalToBin {
    public static long conversion(long octal_num,int i) // Función recursiva original
    {
        int[] octal_numvalues={0,1,10,11,100,101,110,111};
        if (octal_num != 0) {
            return (octal_numvalues[(int)(octal_num % 10)] * i+conversion(octal_num/10,i*1000)); // Se genera la función recursiva
        } else {
            return 0;
        }
    }
    public static void main(String[] args) { // Función principal
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número en octal: "); // Se le solicita al usuario un número para conversión
        long octal_num = in.nextLong(); // Se ingrsan los datos desde el teclado
        System.out.print("Numero binario: " + conversion(octal_num,1)); // Se exhibe el resultado
    }
}