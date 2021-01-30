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
public class ArchivosExceptions extends Exception{
    String filename;
    public ArchivosExceptions(String filename){
        this(filename,"No se puede procesar archivo archivo"+filename);
    }
    public ArchivosExceptions(String filename,String msg){
        super(msg);
        this.filename=filename;
    }
}
