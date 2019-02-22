
// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 17:15
// Hace: Da el tiempo acorde a la zona horaria
import java.util.Calendar; // Libreria que permite el acceso a datos referentes al tiempo
import java.util.TimeZone; // Libreria que permite el acceso a datos referentes a la zona horaria
import java.text.SimpleDateFormat; //Libreria para dar forma a los datos de tiempo

class SystemTime {
    public static void main(String[] Args) {
        SimpleDateFormat formato = new SimpleDateFormat("yy/mm/dd hh:mm:ss.SSS"); //Se instancia con los valores apropiados
        formato.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GTM")));  //Se obtiene la zona horaria
        System.out.println("En este momento: " + formato.format(System.currentTimeMillis()));  //Despliega el formato actual
    }
}