/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo.data;

import com.pooespol.proyecto2_poo.App;
import com.pooespol.proyecto2_poo.modelo.Cuenta;
import com.pooespol.proyecto2_poo.modelo.Mesa;
import com.pooespol.proyecto2_poo.modelo.Venta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class VentasData {
    
    static String ruta="reporteVentas.txt";
    
    public static ArrayList<Venta>leerVentas() throws IOException {
        ArrayList<Venta> ventas = new ArrayList<>();
        try{
            URL u = App.class.getResource(ruta);
            File file = new File(u.toURI());
            try(BufferedReader bf = new BufferedReader(new FileReader(file))){
                String linea;
                while((linea = bf.readLine())!=null){
                    String partes[] = linea.split(";");
                    if(partes.length == 6){
                        //01-01-2021;1;dustin;1;Pamela;210.45
                        //ventas.add(new Venta(LocalDate.parse(partes[0]),new Cuenta(new Mesa(Integer.parseInt(partes[1])),partes[3],Integer.parseInt(partes[4])),partes[2] ,Double.parseDouble(partes[5]))); 
                    }
                    
                     
                    
                }
            }
        }
        
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
            throw ex;
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return ventas;
    } 
}
