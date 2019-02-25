
// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 15:00
// Hace: Invertir palabra.
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola

class Palindromo {
    public static String pal(String palabra,int contador) {
        if (palabra.length() != contador) {
            return (pal(palabra, contador + 1) + palabra.charAt(contador)); //Empieza la forma recursiva de la funci[on]
        } else
            return "";
    }

    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");  // Se pide la frase
        String palabra = entrada.nextLine();   //La frase se guarda aqui
        System.out.println("La frase invertida es: " + pal(palabra,0));
        
        
    }
}