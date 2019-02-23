
// Autor: George Rodríguez
// Fecha y hora: 22/2/2019 13:29
// Hace: Pide al usuario tres numeros y hace una comparación para ver si dos digitos de estas 
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class RightDigit {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in); // Se instancia el objeto
        System.out.println("Ingrese el primer numero:  "); // Se solicita el numero
        int numero1 = entrada.nextInt(); // Se lee la entrada
        System.out.println("Ingrese el segundo numero:  "); // Se solicita el numero
        int numero2 = entrada.nextInt(); // Se lee la entrada
        System.out.println("Ingrese el tercer numero:  "); // Se solicita el numero
        int numero3 = entrada.nextInt(); // Se lee la entrada
        if ((numero1%10 == numero2%10) || (numero2%2 == numero3%10) || (numero1 %10 == numero3 % 10))
            System.out.println("true"); // Se da la respuesta
        else
            System.out.println("false"); // Se da la respuesta
    }
}