/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo.modelo;

import com.pooespol.proyecto2_poo.modelo.Cuenta;
import com.pooespol.proyecto2_poo.modelo.Mesero;
import com.pooespol.proyecto2_poo.modelo.Ubicacion;

/**
 *
 * @author nicol
 */
public class Mesa {
    private int numero;
    private int capacidad;
    private Cuenta cuenta;
    private Ubicacion ubicacion;
  

    public Mesa(int numero, int capacidad,Ubicacion ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        
    }

    public Mesa(int numero, int capacidad, Cuenta cuenta, Ubicacion ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.cuenta = cuenta;
        this.ubicacion = ubicacion;
    }
    
       

    public Mesa(int numero) {
        this.numero = numero;
        
    }
 

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


    @Override
    public String toString() {
        return "Mesa numero=" + numero + ", capacidad=" + capacidad + ", cuenta=" + cuenta+ ", ubicacion=" + ubicacion ;
    }
    
}
