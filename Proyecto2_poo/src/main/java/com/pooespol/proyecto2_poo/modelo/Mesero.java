/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo.modelo;

/**
 *
 * @author nicol
 */
public class Mesero extends Usuario{

    private String nombre;

    public Mesero(String email,String password,String nombre) {
        super(email,password);
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre ;
    }
    
}
