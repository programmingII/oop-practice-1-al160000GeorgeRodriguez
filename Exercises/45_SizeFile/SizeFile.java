
// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 16:55
// Hace: Provee el tama;o de un archivo
import java.util.Scanner; // Libreria que permite el acceso de datos desde consola
import java.io.File; // Esta clase representa los metodos que  permiten trabajar con los nombres de los archivos y los directorios

class SizeFile {
    public static void main(String[] Args) {
        System.out.println("C:\\java\\oop-practice-1-al160000GeorgeRodriguez\\Exercises\\abc.txt: "+new File("abc.txt").length()+" bytes"); //Se abre una nueva consulta para el archivo
        System.out.println("C:\\java\\oop-practice-1-al160000GeorgeRodriguez\\Exercises\\test.txt: "+new File("Apuntes.txt").length()+" bytes");  // Se abre una nueva consulta para el archivo indicado
    }
}