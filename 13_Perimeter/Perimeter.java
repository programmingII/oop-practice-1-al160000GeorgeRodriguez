//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:30
//Hace: 13. Write a Java program to print the area and perimeter of a rectangle.
import java.util.Scanner;
class Perimeter{
    public static void main(String[] Args){
        Scanner entrada=new Scanner(System.in); // Se inicializa el proceso de entrada
        System.out.println("Ingrese la altura"); //Se pide un numero
        double altura=entrada.nextDouble(); //Se ingresa el primer numero
        System.out.println("Ingrese la base"); //Se pide un numero
        double base=entrada.nextDouble(); //Se ingresa el primer numero
        System.out.println("El area del rectangulo es: "+((base*altura)/2)); //Se da el resultado
        System.out.println("El perimetro del rectangulo es: "+((base+altura)*2)); //Se da el resultado
    }
}