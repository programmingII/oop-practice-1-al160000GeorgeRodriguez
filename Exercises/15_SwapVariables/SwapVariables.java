//Autor: George Rodríguez
//Fecha y hora: 5/2/2019 13:00
//Hace: Write a Java program to swap two variables
import java.util.Scanner;  // Libreria para ingresar numeros desde consola
class SwapVariables{
    public static void main(String[] Args){
        int aux; //Se declaran las varibles
        Scanner entrada=new Scanner(System.in); //Se inicializa la variable con el constructor de Scanner
        System.out.println("Ingrese un numero a: "); //Se pide un numero al usuario
        int a=entrada.nextInt(); //Se ingresa por teclado
        System.out.println("Ingrese otro numero b: "); //Se pide un numero al usuario
        int b=entrada.nextInt(); //Se ingresa por teclado
        aux=a;  // Se intercambian
        a=b;
        b=aux;
        System.out.println("El valor de a es "+a+" y el valor de b "+b); //Se pide un numero al usuario


    }
}
