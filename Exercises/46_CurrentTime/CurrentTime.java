
// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 17:15
// Hace: Da el tiempo 
import java.util.Calendar; // Libreria que permite el acceso a datos referentes al tiempo
import java.text.SimpleDateFormat; //Libreria para dar forma a los datos de tiempo

class CurrentTime {
    public static void main(String[] Args) {
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss"); // Se instancia con los valores
                                                                                  // apropiados
        System.out.printf("En este momento:  %n "+formato.format(System.currentTimeMillis())); //Se obtiene la hora actual
    }
}