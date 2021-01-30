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
public class Producto {
    private String nombre;
    private double precio;
    private String imagen;
    private String tipo;

    public Producto(String nombre, double precio, String imagen,String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", imagen=" + imagen + ", tipo=" + tipo + '}';
    }
    
}
