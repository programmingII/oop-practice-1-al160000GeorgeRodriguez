
// Autor: George Rodríguez
// Fecha y hora: 22/2/2019 13:29
// Hace: Convierte el numero de segundos a minutos y horas
import java.util.Scanner;
class SecondToHour {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de segundos: ");
        int seg = entrada.nextInt();
        int seg1 = seg % 60;
        int hr = seg / 60;
        int min = hr % 60;
        hr = hr / 60;
        System.out.println(hr + ":" + min + ":" + seg1);
    }
}