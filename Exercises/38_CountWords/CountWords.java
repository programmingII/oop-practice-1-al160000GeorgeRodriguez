
// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 15:00
// Hace: Contar tipos de palabra.
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class CountWords {
    public static int palD(String palabra,int i, int contador) {//Cuenta los numeros
        if (palabra.length() != i) {
            if (Character.isDigit(palabra.charAt(i)))
                contador += 1;  //Contador de numero
            return (palD(palabra, i + 1,contador)); //Empieza la forma recursiva de la funci[on]
        } else
            return contador;
    }

    public static int palL(String palabra,int i, int contador) {//Cuenta las letras
        if (palabra.length() != i) {
            if (Character.isLetter(palabra.charAt(i)))
                contador += 1;  //Contador de letras
            return (palL(palabra, i + 1,contador)); //Empieza la forma recursiva de la funci[on]
        } else
            return contador;
    }
    public static int palS(String palabra,int i, int contador) { //Cuenta los espacios
        if (palabra.length() != i) {
            if (Character.isSpaceChar(palabra.charAt(i)))
                contador += 1;    //Contador de espacios
            return (palS(palabra, i + 1,contador)); //Empieza la forma recursiva de la funcion
        } else
            return contador;
    }

    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in); ///Se instancia el objeto scanner
        System.out.println("Ingrese una frase: ");  //Se le pide al usuario que ingrese la frase
        String palabra = entrada.nextLine();  //Se captura
        System.out.println("Letras: " + palL(palabra,0,0));  //Muestra el tipo de elemento que esta presente en la frase
        System.out.println("Space: " + palS(palabra,0,0));
        System.out.println("Number: " + palD(palabra,0,0));
    }
}