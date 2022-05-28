
import paquete5.LecturaArchivoSecuencial;
import paquete5.Hospital;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {

// nombre del archivo
        String nombreArchivo = "Hospitales.data";
        String id_buscar = "7";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);

        lectura.establecerIdentificador(id_buscar);
        lectura.estableceHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();

        if (hospital_buscar != null) {

            System.out.println(hospital_buscar);

        } else {
            System.out.println("Hospital no encontrado");
        }

    }
}
