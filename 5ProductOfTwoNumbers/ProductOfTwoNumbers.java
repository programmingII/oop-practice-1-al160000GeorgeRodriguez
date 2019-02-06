//Autor: George Rodríguez
//Fecha y hora: 5/2/2019 13:00
//Hace: Write a Java program that takes two numbers as input and display the product of two numbers.
import java.util.Scanner;
class ProductOfTwoNumbers{
    public static void main(String[] Args){
Scanner entrada=new Scanner(System.in);
System.out.print("Ingresa el primer numero: ");
int numero1=entrada.nextInt();
System.out.print("Ingresa el segundo numero: ");
int numero2=entrada.nextInt();
System.out.print(numero1+"x"+numero2+" = "+numero1*numero2);


    }
}