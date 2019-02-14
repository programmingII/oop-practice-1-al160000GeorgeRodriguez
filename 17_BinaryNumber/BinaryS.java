//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:35
//Hace: Write a Java program to add two binary numbers.
import java.util.Scanner; // Libreria para ingresar numeros desde consola
class BinaryS{
    public static Long suma(Long a,Long b){
          String as=Long.toString(a); //convierte el numero a cadena
        String bs=Long.toString(b);
        int acarreo=0,sumaParcial=0;
        StringBuilder resultado= new StringBuilder(""); //Se inicializa el constructor  de cadenas
        int along=Long.toString(a).length(); //obtiene la longitud de la cadena
        int blong=Long.toString(b).length();
        
        if(along>blong){            // Se analiza si los numeros son del mismo tamaño
            for(int i=0;i<along-blong;i++){
                bs="0"+bs;               //Se agregan los ceros correspodientes al menor
            }
        }
        if(along<blong){
            for(int i=0;i<blong-along;i++){ //// Se analiza si los numeros son del mismo tamaño
                as="0"+as;      //Se agregan los ceros correspodientes al menor
            }
        }
        blong=bs.length();
            for(int i=blong;i>0;i--){ //Se inicia un ciclo for con la longitud de la cadena
            sumaParcial=(Integer.valueOf(as.charAt(i-1))-48)+(Integer.valueOf(bs.charAt(i-1))-48)+acarreo;//Se suman las variables involucradas
                if(sumaParcial==0){
                    resultado.insert(0,"0"); //Inserta el resultado por delante
                    acarreo=0;
                }
                if(sumaParcial==1){
                    resultado.insert(0,"1");
                    acarreo=0;
                }
                if(sumaParcial==2){
                    resultado.insert(0,"0");
                    acarreo=1;
                }
                if(sumaParcial==3){
                    resultado.insert(0,"1");
                    acarreo=1;
                }        
                if(acarreo==1 && i==1) resultado.insert(0,"1"); //Si al final del ciclo el acarreo es 1, éste se agrega al resultado
                
        }
        return Long.valueOf(resultado.toString()); //Se devuelve el resultado
    }
    public static void main(String[] Args){
        Scanner entrada=new Scanner(System.in); //Se inicializa la variable con el constructor de Scanner
        System.out.println("Ingrese un numero en binario: "); //Se pide un numero al usuario
        long a=entrada.nextLong(); //Se ingresa por teclado
        System.out.println("Ingrese otro numero en binario: "); //Se pide un numero al usuario
        long b=entrada.nextLong(); //Se ingresa por teclado
        System.out.println("La suma es: "+suma(a,b)); //Se pide un numero al usuario

      

    }
}