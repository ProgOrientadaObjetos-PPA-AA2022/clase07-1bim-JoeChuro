/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.data";

        Hospital h1 = new Hospital("Clinica Abendanio", 20, 2000);
        Hospital h2 = new Hospital("Clinica San Antonio", 20, 2000);
        Hospital h3 = new Hospital("Clinica Santa Ines", 20, 2000);

        Hospital[] lista = {h1, h2, h3};
        
        EscrituraArchivoSecuencial archivo = new
        EscrituraArchivoSecuencial(nombreArchivo);
        
        archivo.establecerHospitales(h1);
        archivo.establecerSalida();
        archivo.establecerHospitales(h2);
        archivo.establecerSalida();
        archivo.establecerHospitales(h3);
        archivo.establecerSalida();
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerHospitales(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
        
        
    }

