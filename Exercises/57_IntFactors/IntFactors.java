// Autor: George Rodríguez
// Fecha y hora: 22/2/2019 19:29
// Hace: Numeros entre rangos
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola
public class IntFactors {
    public static int resultado(int num, int i, int ctr) 
     {
       if (i <= (int) Math.sqrt(num)) {  //Se le extrae la raíz al numero
            if ((num % i == 0) && (i * i != num)) {  //Si es un número primo se evidencia
                 return resultado(num, i + 1, ctr + 2); //Se dan los unicos numeros para un primo
            } else if (i * i == num) {  //El cuadrado del numero
                return resultado(num, i + 1, ctr + 1);  // Da un nuevo multiplo
            } else{
                return resultado(num, i + 1, ctr);}  //Se continua el ciclo
        } 
         return ctr;  //Se dvuelve el resultado
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Se instancia el objeto
        System.out.println("Ingrese un numero:  "); // Se solicita el numero
        int numero = entrada.nextInt(); // Se lee la entrada
        System.out.println("Factores: " + resultado(numero,1,0)); // Se da la respuesta
    }
}