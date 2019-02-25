// Autor: George Rodríguez
// Fecha y hora: 24/2/2019 21:29
// Hace: Saca la suma de los primeros 100 primos
class SumPrimos {
    static int primo(int num, int n, int sal) {
        if (sal < 2) {

            if (n == 1)
                return 1; //Si es el ultimo numero la salida es un uno
           // System.out.println("num= " + num + " n - 1 =" + (n - 1) + " sal + 1 = " + (sal + 1));
            if (num % n == 0)
                return primo(num, n - 1, sal + 1); //Incrementa en uno  el numero de dividendos con modulo cero
            else
                return primo(num, n - 1, sal); //Si es diferente solo disminuye el numero
            } else {
                return 0;  // Si hay mas numeros la salida es cero
            }
        }
        
        static int sumaP(int n,int x) {
            if (n < 101) {    //100 primeros primos
                if ((primo(x, x, 0) == 1)) {  //Evalua si es primo
              //      System.out.println(n +"  "+ x);  
                return (x + sumaP(n + 1, x + 1)); //Hace la suma del primo
            }
            return sumaP(n , x + 1);  //Solo incrementa en uno
            }
                return (0); //Cero final
    }
    public static void main(String[] Args) {
        System.out.print(sumaP(1,2));//Se expresa el resultado
    }
}