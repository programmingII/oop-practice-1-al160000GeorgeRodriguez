//Autor: George Rodríguez
//Fecha y hora: 7/2/2019 12:45
//Hace: Version de java.
public class javaInstaller {
    public static void main(String[] args) {
        System.out.println("Version de java: " + System.getProperty("java.version"));
        System.out.println("Java  Version del Runtime: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
}