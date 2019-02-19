
//Autor: George Rodríguez
//Fecha y hora: 18/2/2019 15:45
//Hace: octal a decimal.
import java.util.Scanner; //Se importa la librería Scanner para el ingreso desde el teclado
class octalToHex {
    public static void main(String args[])
        {
            String octal, hex;
            int dec;
            Scanner in = new Scanner(System.in);	//Se instancia la variable
            System.out.print("Ingrese el numero octal: ");  //Se pide al usuario un numero
            octal = in.nextLine();	//Se ingresa
            dec = Integer.parseInt(octal, 8);  // Se invoca un metodo de integer para traducirlo a octal
            hex = Integer.toHexString(dec); //Se invoca un metodo para convertir a hexadecimal
            System.out.print("El numero hexadecimal es: "+ hex);  //Se muestra el resultado
        }
}
