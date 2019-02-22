// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 17:29
// Hace: Presenta los numeros nones de uno al 99 
class OddNumbers {
    public static int number(int i) {
        if (i != 99) {   //Hasta 99 para que imprima el 97
            if (i % 2 == 1) //Si el residuo es 1 entonces el numero es non
                System.out.println(i);
            return number(i+1);  //Se llama asi misma
        } else
            return i;
    }

    public static void main(String[] Args) {
        System.out.println("Los numero nones de 1 al 99 son: "); //Se envia el mensaje
        System.out.println(number(1));  //Se llama a la funci[on recursiva
    }
}