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
public class Administrador extends Usuario{
   
    public Administrador(String email, String password) {
        super(email, password);
    }

    @Override
    public String toString() {
        return "Administrador{" + '}';
    }
    
}
