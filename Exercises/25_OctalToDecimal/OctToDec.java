//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:45
//Hace: octal a decimal.
import java.util.Scanner;  //Se importa la librería Scanner para el ingreso desde el teclado
public class OctToDec {
    public static long conversion(long octal_num,int i) //Función recursiva original
    {
        if(octal_num != 0){
            return ((long) ((octal_num % 10) * Math.pow(8, i))+conversion(octal_num / 10,i+1)); //Se genera la función recursiva
        }else
        {
            return 0;
        } 
    }

    public static void main(String[] args) {    //Función principal
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número en octal: ");  //Se le solicita al usuario un número para conversión
        long octal_num = in.nextLong();  //Se ingrsan los datos desde el teclado
        System.out.print("Equivalent decimal number: " + conversion(octal_num,0) ); //Se exhibe el resultado
    }
}