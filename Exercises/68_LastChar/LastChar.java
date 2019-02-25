// Autor: George Rodríguez
// Fecha y hora: 24/2/2019 21:29
// Hace: INsertar tres ultimos caracteres
public class LastChar {
    public static void main(String[] args) {
        String MiCadena = "Python 3.0";  // Frase principal
        String TresCar = MiCadena.substring(MiCadena.length() - 3); //Se calcula la longitud de la cadena
        System.out.println(TresCar + TresCar + TresCar + TresCar);  //Se muestran los resultados
    }
}