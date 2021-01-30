/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo.modelo;

import com.pooespol.proyecto2_poo.modelo.Cuenta;
import com.pooespol.proyecto2_poo.modelo.Mesero;
import java.time.LocalDate;

/**
 *
 * @author nicol
 */
public class Venta {

    private LocalDate fecha;
    private Cuenta datosCuenta;
    private Mesero mesero;
    private double total;

    public Venta(LocalDate fecha, Cuenta datosCuenta, Mesero mesero, double total) {

        this.fecha = fecha;
        this.datosCuenta = datosCuenta;
        this.mesero = mesero;
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cuenta getDatosCuenta() {
        return datosCuenta;
    }

    public void setDatosCuenta(Cuenta datosCuenta) {
        this.datosCuenta = datosCuenta;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ",Mesa: " + datosCuenta.getMesa() + ", Mesero=" + mesero + "#Cuenta: " + datosCuenta.getNumCuenta() + "Cliente: " + datosCuenta.getCliente() + ", Total=" + total;
    }

}
