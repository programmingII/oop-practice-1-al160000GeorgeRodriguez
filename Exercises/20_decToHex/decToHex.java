
//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:35
//Hace: Decimal a hexadecimal.
import java.util.Scanner;
public class decToHex {
public static String conversion(int decimal){
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',' '};  //Se asignan los posibles resultados  de la operacion a los indices de una matriz    
        int indice=16; //se declara la variable para numero ingresado y el indice del arreglo
        indice =decimal%16; //se saca el modulo
    if (decimal>0) {
      System.out.println("Entra al if"+Character.toString(hex[indice]));
      return (hex[indice] + conversion(decimal / 16)); //Se ocupa el indice para asignar la variable Hasta que ya no sea posible dividir     
    } else {
             return ("");
         }
}
      public static void main(String args[])
    {
  Scanner in = new Scanner(System.in);	//Se inicializa la funcion que nos permite ingresar desde el teclado
    System.out.print("Ingrese un numero decimal: ");
    int decimal = in.nextInt();
    System.out.print("El numero hexadecimal es : "+conversion(decimal));      //Se expresa el resultado          
    in.close();
    }
}