
// Autor: George Rodríguez
// Fecha y hora: 24/2/2019 21:29
// Hace: Pide al usuario hacer una comparación
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class TwoInt2575 {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in); // Se instancia el objeto
        boolean i;
        do{
        System.out.println("Ingrese el primer numero:  "); // Se solicita el numero
        int numero1 = entrada.nextInt(); // Se lee la entrada
        System.out.println("Ingrese el segundo numero:  "); // Se solicita el numero
            int numero2 = entrada.nextInt(); // Se lee la entrada
            i = (numero1 > 24 && numero1 < 76 && numero2 > 24 && numero2 < 76);
            if (i) 
            {
                if (numero1 % 10 == numero2 % 10)
                    System.out.println("True "); // Se da la respuesta
                else
                    System.out.println("False "); // Se da la respuesta
                }else{
                    System.out.println("Ingrese numeros menores a 76 y mayores a 24 "); // Se da la respuesta
            }
    }while(!(i));
    }
}