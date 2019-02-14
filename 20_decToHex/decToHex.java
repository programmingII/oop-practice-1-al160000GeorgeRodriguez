import java.util.Scanner;
public class decToHex {
      public static void main(String args[])
    {
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  //Se asignan los posibles resultados  de la operacion a los indices de una matriz    
        int decimal, indice; //se declara la variable para numero ingresado y el indice del arreglo
        String conversion=""; //Cadena para almacenar el resultao
        Scanner in = new Scanner(System.in);	//Se inicializa la funcion que nos permite ingresar desde el teclado
        System.out.print("Ingrese un numero decimal: ");
        decimal = in.nextInt();
        while(decimal>0)  //Hasta que ya no sea posible dividir
        {
            indice = decimal%16; //se saca el modulo
            conversion = hex[indice] + conversion; //Se ocupa el indice para asignar la variable
            decimal = decimal/16; //Se divide entre 16 para sacar el siguiente digito
        }
        System.out.print("El numero hexadecimal es : "+conversion+"\n");      //Se expresa el resultado   
    }
}