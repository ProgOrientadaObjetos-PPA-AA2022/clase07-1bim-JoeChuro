
package paquete6;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // nombre del archivo
        String nombreArchivo = "Hospital.txt";
        
        Hospital h1 = new Hospital("Santa Ines",150,8000.35);
        Hospital h2 = new Hospital("San Jose",500,12000);
        Hospital h3 = new Hospital("Abendaño",100,17000);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        Hospital[] lista = {h1, h2, h3};
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        
    }
    
}
