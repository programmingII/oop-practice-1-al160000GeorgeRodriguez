//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:20
//Hace:write a Java program to print the area and perimeter of a circle.
//import java.util.Scanner;
class Circle{
    public static void main(String[] Args){
        double per, area,radio=7.5; //Declaracion de las variables
        //Scanner entrada=new Scanner(System.in);
        //double radio=entrada.nextDouble();
        per=2*Math.PI*radio;
        area=Math.PI*radio*radio;
        System.out.println("El perimetro es: "+per); //Se imprime el mensaje
        System.out.println("El area es: "+area);
    }

}