
//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:45
//Hace: Compara numeros.
import java.util.Scanner;  // Libreria de acceso a consola

public class compareNumber {
    public static void main(String args[]) {        // Scanner te permite la entrada de numeros desde consola
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer entero: "); // Se le pide al usuario la entrada
        int        numero1 = Entrada.nextInt(); // Se lee el numero desde consola

        System.out.print("Ingresa el segundo entero: "); // Se le pide al usuario la entrada
         int       numero2 = Entrada.nextInt(); // Se lee el numero desde consola

        if (numero1 == numero2)
            System.out.printf("%d == %d\n", numero1, numero2);
        if (numero1 != numero2)
            System.out.printf("%d != %d\n", numero1, numero2);
        if (numero1 < numero2)
            System.out.printf("%d < %d\n", numero1, numero2);
        if (numero1 > numero2)
            System.out.printf("%d > %d\n", numero1, numero2);
        if (numero1 <= numero2)
            System.out.printf("%d <= %d\n", numero1, numero2);
        if (numero1 >= numero2)
            System.out.printf("%d >= %d\n", numero1, numero2);
    }
}