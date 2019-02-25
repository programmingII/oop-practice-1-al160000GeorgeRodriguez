
// Autor: George Rodríguez
// Fecha y hora: 24/2/2019 21:29
// Hace: Saca el modulo
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class Modulo {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in); // Se instancia el objeto
            System.out.println("Ingrese el primer numero:  "); // Se solicita el numero
            int numero1 = entrada.nextInt(); // Se lee la entrada
            System.out.println("Ingrese el segundo numero:  "); // Se solicita el numero
        int numero2 = entrada.nextInt(); // Se lee la entrada
            int division = numero1 / numero2;
            division = numero1 - (division * numero2);
            System.out.println(division);
            
    }
}