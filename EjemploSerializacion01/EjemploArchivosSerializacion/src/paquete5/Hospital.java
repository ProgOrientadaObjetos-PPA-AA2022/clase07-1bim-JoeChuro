/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    
    public Hospital(String n, int c, double p, String id){
    nombre = n;
    numeroCamas = c;
    presupuesto = p;
    idHospital = id;
    }
    
    public void establecerNombreHospital(String n){
    nombre = n;
    }
    
    public void establecerNumeroCamas(int c){
    numeroCamas = c;
    }
    
    public void establecerPresupuesto(double p){
    presupuesto = p;
    }
    
    public void establecerId(String x){
    idHospital = x;
    }
    
    public String obtenerNombreHospital(){
    return nombre;
    }
    
    public int obtenerNumeroCamas(){
    return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
    return presupuesto;
    }
    public String obtenerId(){
    return idHospital;
    }
    @Override
    public String toString(){
        String valor = String.format("%s-%d-%.2f\n", obtenerNombreHospital(), 
                obtenerNumeroCamas(),
                obtenerPresupuesto());
        return valor;
    }
}