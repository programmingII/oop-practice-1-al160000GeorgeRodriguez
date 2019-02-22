// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 17:29
// Hace: Presenta los numeros nones de uno al 99 
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class EvenOdd {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in);  //Se instancia el objeto
        System.out.println("Ingrese un numero: "); //Se manda el mensaje
        int numero = entrada.nextInt();// Se ingresa el numero
        System.out.println((numero%2)); // Se envia el mensaje

    }
}