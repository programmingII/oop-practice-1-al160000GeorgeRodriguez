//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:35
//Hace: Write a Java program to multiply two binary numbers.
import java.util.Scanner; // Libreria para ingresar numeros desde consola
class BinaryM{
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
        public static Long multiplicacion(Long a,Long b){
        String as=Long.toString(a); //convierte el numero a cadena
        String bs=Long.toString(b);
        int acarreo=0,mulParcial=0,factor=1;
        StringBuilder resultado= new StringBuilder(""); //Se inicializa el constructor  de cadenas, el constructor de cadenas se utiliza para almacenar y manipular dinamicamente las cadenas.
        Long par1,valor;
        int along=Long.toString(a).length(); //obtiene la longitud de la cadena
        int blong=Long.toString(b).length();
        par1=0L;    //Se inicializan las variables
        valor=0L;
        for(int i=along; i>0;i--){
          for(int j=blong; j>0;j--){
              mulParcial=(Integer.valueOf(as.charAt(i-1))-48)*(Integer.valueOf(bs.charAt(j-1))-48);  //Se multiplican los digitos
              resultado.insert(0,Integer.toString(mulParcial));  //Se insertan en el acumulador
               // System.out.println("mulParcial="+mulParcial);  //Sentencias de depuracion
                //System.out.println("resultado="+resultado);
        }   
        par1=Long.valueOf(resultado.toString());//Se convierte a Long la cadena
        resultado.delete(0,resultado.length()); // Se reinicializa la variable resultado de forma adecuada
        valor=suma(valor,par1*factor);  //Se suman los numeros parciales
      //  System.out.println(valor+"="+"suma("+valor+","+par1*factor+")");//Sentencia para depuracion
        factor=factor*10;
        }
        return valor; //Se devuelve el resultado
    }
    public static void main(String[] Args){
        Scanner entrada=new Scanner(System.in); //Se inicializa la variable con el constructor de Scanner
        System.out.println("Ingrese un numero en binario: "); //Se pide un numero al usuario
        long a=entrada.nextLong(); //Se ingresa por teclado
        System.out.println("Ingrese otro numero en binario: "); //Se pide un numero al usuario
        long b=entrada.nextLong(); //Se ingresa por teclado
        System.out.println("La multiplicacion es: "+multiplicacion(a,b)); //Se llama a la funcion y se muestra el resultado

    }
}