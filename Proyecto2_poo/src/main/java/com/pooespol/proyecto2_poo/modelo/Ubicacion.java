/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo.modelo;

/**
 *
 * @author Dustin Pisco
 */
public class Ubicacion {
  private double coordenadaX;
  private double coordenadaY;
  
  public Ubicacion (double x, double y){
      this.coordenadaX= x;
      this.coordenadaY=y;
  }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
  
}
