// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 16:20
// Hace: Solicita una contrase;a desde consola.
import java.io.Console;   // Esta libreria provee los metodos para acceder a los dispositivos con consola
class PasswordConsole {
    public static void main(String[] Args) {
        Console MiConsola = System.console(); //Se inicializa y se le asigna un valor
        if (MiConsola == null) {
            System.out.print("No se detecta la consola!");  //Se comprueba si existe consola
            return;  //Si no existe consola sale del programa
        }
        char[] contra = null;   //Se declara la variable en la que capturamos la constrsenia
        contra = MiConsola.readPassword("Ingrese su password:");   //Se solicita la contrase;a
        System.out.println("Su password fue: "+new String(contra));  //Se exhibe la contrase;a
    }
}