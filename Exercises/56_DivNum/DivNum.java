// Autor: George Rodríguez
// Fecha y hora: 22/2/2019 17:29
// Hace: Numeros entre rangos
public class DivNum {
    public static void main(String[] args) {
        int x = 5;    //numero inicial
        int y = 20;   // numero final
        int p = 3;      //Diviidendo
         if (x % p == 0)       
            System.out.println((y / p - x / p + 1));  //Se sacan los resultados
        else
            System.out.println((y / p - x / p));  // Se sacan los resultados
    }
}