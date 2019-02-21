
// Autor: George Rodríguez
// Fecha y hora: 21/2/2019 15:00
// Hace: Muestra los Charset.
import java.nio.charset.Charset;  // Java guarda todo el conjunto en estas secciones
class CharacterSet {
    public static void main(String[] Args){
        System.out.println("Los conjuntos de caracteres disponibles son: ");
        for (String str : Charset.availableCharsets().keySet()) {  //El ciclo muestra uno por uno el conjunto de conjuntos disponibles
            System.out.println(str);
        }

    }
}