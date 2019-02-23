// Autor: George Rodríguez
// Fecha y hora: 22/2/2019 12:29
// Hace: Ingresa un string y devuelve un entero 
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class StringToInt {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in); //Se instancia el objeto
        System.out.println("Ingrese un numero(String):  "); //Se solicita el numero
        String numero = entrada.nextLine();  //Se lee la entrada
        System.out.println("El numero ingresado fue: "+Integer.parseInt(numero)); //Se da la respuesta
    }
}