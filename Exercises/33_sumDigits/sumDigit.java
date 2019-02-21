// Autor: George Rodríguez
// Fecha y hora: 7/2/2019 12:45
// Hace: Sum digit.
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class sumDigit{
    public static int suma(int a) {
        if (a != 0) {
            return (a % 10 + suma(a / 10)); //Argumento recursivo divide hasta que sea cero
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Instancia la variable entrada
        System.out.println("Ingrese un numero: "); // Pide el ingreso 
        int numero = entrada.nextInt(); //Captura el ingrreso
        System.out.println("La suma de sus digitos es: "+suma(numero)); // Visualiza el resultado
    }
}