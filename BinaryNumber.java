//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:35
//Hace: Write a Java program to add two binary numbers.
java.util.Scanner; // Libreria para ingresar numeros desde consola
class BinaryNumber{
    public static void main(String[] Args){
        Scanner entrada=new Scanner(System.in); //Se inicializa la variable con el constructor de Scanner
        System.out.println("Ingrese un numero en binario: "); //Se pide un numero al usuario
        long a=entrada.nextLong(); //Se ingresa por teclado
        System.out.println("Ingrese otro numero en binario: "); //Se pide un numero al usuario
        long b=entrada.nextLong(); //Se ingresa por teclado

    }
}