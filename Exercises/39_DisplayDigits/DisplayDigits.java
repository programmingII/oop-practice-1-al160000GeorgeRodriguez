
// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 15:00
// Hace: Displa digits.
import java.util.Scanner;

class DisplayDigits {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 4; i++) { /// Los contadores generan nuevos elementos
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) { //Si son iguales los descarta
                        contador++;
                        System.out.println(i + " " + j + " " + k); //se muestra cada elemento
                    }
                }
            }
        }
        System.out.println("El total de numeros son: " + contador); //Se muestra el numero total de elementos
    }
}