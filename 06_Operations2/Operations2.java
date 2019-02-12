//Autor: George Rodríguez
//Fecha y hora: 5/2/2019 13:10
//Hace:Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
class Operations2{
    public static void main(String[] cualquierCosa){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1=entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2=entrada.nextInt();
        System.out.println(numero1+"+"+numero2+"="+(numero1+numero2));
        System.out.println(numero1+"-"+numero2+"="+(numero1-numero2));
        System.out.println(numero1+"*"+numero2+"="+numero1*numero2);
        System.out.println(numero1+"/"+numero2+"="+numero1/numero2);
        System.out.println(numero1+" mod "+numero2+"="+numero1%numero2);

    }
}