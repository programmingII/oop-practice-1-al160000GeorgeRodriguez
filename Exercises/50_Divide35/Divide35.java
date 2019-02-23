// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 21:33
// Hace: Presenta los numeros nones de uno al 99 
class Divide35 {

    public static int number2(int i,int dividendo1,int dividendo2, int last) {
        if (i != 100) {   //Hasta 99 para que imprima el 97
            if (i % dividendo1 == 0) {//Si el residuo es 0 entonces el numero es non
                if (i % dividendo2 == 0) {//Si el residuo es 0 entonces el numero es non
                if(last!=0) System.out.print(last + ",");
                    last = i;
                }
            }
            return number2(i+1,dividendo1,dividendo2,last);  //Se llama asi misma
        } else
            return last;
    }

    public static void main(String[] Args) {
        System.out.println("Divisibles entre 3: "); //Se envia el mensaje
        System.out.println(number2(1,3,3,0));  //Se llama a la funci[on recursiva
        System.out.println("Divisibles entre 5: "); //Se envia el mensaje
        System.out.println(number2(1,5,5,0));  //Se llama a la funci[on recursiva
        System.out.println("Divisibles entre 3 y 5: "); //Se envia el mensaje
        System.out.println(number2(1,3,5,0));  //Se llama a la funci[on recursiva
    }
}