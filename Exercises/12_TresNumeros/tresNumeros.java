//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:22
//Hace: Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner; //Biblioteca para ingresar los numeros desde teclado
class TresNumeros{
    public static void main(String[] Args){
        Scanner entrada=new Scanner(System.in); // Se inicializa el proceso de entrada
        System.out.println("Ingrese el primer numero"); //Se pide un numero
        int uno=entrada.nextInt(); //Se ingresa el primer numero
        System.out.println("Ingrese el segundo numero"); //Se pide un numero
        int dos=entrada.nextInt(); //Se ingresa el primer numero
        System.out.println("Ingrese el tercer numero"); //Se pide un numero
        int tres=entrada.nextInt(); //Se ingresa el primer numero
        System.out.println("El promedio de los tres numeros es: "+((uno+dos+tres)/3)); //Se da el resultado

    }
}