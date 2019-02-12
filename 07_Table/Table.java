//Autor: George Rodríguez
//Fecha y hora: 5/2/2019 13:20
//Hace: Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;
class Table{
    public static void main(String[] Args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int in=entrada.nextInt();
        for (int i=0; i<10; i++){
            System.out.println(in+" x "+(i+1)+" = "+(injava*(i+1)));
        }
    }
}