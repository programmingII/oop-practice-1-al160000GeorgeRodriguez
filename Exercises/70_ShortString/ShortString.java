// Autor: George Rodríguez
// Fecha y hora: 24/2/2019 21:29
// Hace: Crea una cadena con tres elementos cortos
public class ShortString {
    public static void main(String[] args) {
        String Cad1 = "Java";
        String Cad2 = "Tutorial";

        if (Cad1.length() >= Cad2.length())
            System.out.println(Cad2 + Cad1 + Cad2);
        else
            System.out.println(Cad1 + Cad2 + Cad1);
    }
}