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
    
    public Hospital(String n, int c, double p){
    nombre = n;
    numeroCamas = c;
    presupuesto = p;
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
    
    public String obtenerNombreHospital(){
    return nombre;
    }
    
    public int obtenerNumeroCamas(){
    return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
    return presupuesto;
    }
}