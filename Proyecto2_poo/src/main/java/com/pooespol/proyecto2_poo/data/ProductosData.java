/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo.data;

import com.pooespol.proyecto2_poo.App;
import com.pooespol.proyecto2_poo.modelo.ArchivosExceptions;
import com.pooespol.proyecto2_poo.modelo.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class ProductosData {
    static String ruta = "Productos.txt";
    
    /**
     * Esta funcion lee el archivo productos.txt que se encuentra en 
     * el paquete recursos y retorna un ArrayList con los generos descritos 
     * en el archivo
     * FORMATO ARCHIVO
     *  tipo;producto;precio;imagen
     * @return ArrayList<Producto>
     */
    public static ArrayList<Producto>leerProducto() throws IOException {
        ArrayList<Producto> products = new ArrayList<>();
        try{
            URL u = App.class.getResource(ruta);
            File file = new File(u.toURI());
            try(BufferedReader bf = new BufferedReader(new FileReader(file))){
                String linea;
                while((linea = bf.readLine())!=null){
                    String partes[] = linea.split(";");
                    if(partes.length == 4){
                        products.add(new Producto(partes[1],Double.parseDouble(partes[2]),partes[3],partes[0])); 
                    }
                    //String nombre, double precio, String imagen,String tipo
                    //tipo 0 ; nombre_producto1 , precio 2 ,imagen 3
                     
                    
                }
            }
        }
        
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
            throw ex;
        
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            ex.printStackTrace();
            }
        return products;
    } 
    
    public static ArrayList<Producto> parsearProductos(String tipo) {
        ArrayList<Producto> listaResultado = new ArrayList<>();
        try{ 
           for(Producto p :leerProducto()){
               if(p.getTipo().equals(tipo)){
                   listaResultado.add(p);
               }
           } 
        }catch(IOException ex){
            System.out.println("Ocurrio un error al parsear los productos por tipo");
            ex.printStackTrace();
        } 
        return listaResultado;
    }
    
    public static ArrayList<Producto> parsearProductosNombre(String nombre) {
        ArrayList<Producto> listaResultado = new ArrayList<>();
        try{ 
           for(Producto p :leerProducto()){
               if(p.getNombre().equals(nombre)){
                   listaResultado.add(p);
               }
           } 
        }catch(IOException ex){
            System.out.println("Ocurrio un error al parsear los productos por tipo");
            ex.printStackTrace();
        }
        return listaResultado;
    }
    
      public static ArrayList<String> obtenerTipos() {
        ArrayList<String> listaResultado = new ArrayList<>();
        try{ 
           for(Producto p :leerProducto()){
               if(listaResultado.contains(p.getTipo())==false){
                   listaResultado.add(p.getTipo());
               }
           } 
        }catch(IOException ex){
            System.out.println("Ocurrio un error al parsear los tipos de producto");
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listaResultado;
    }
      
      
      
     public static ArrayList<Producto> escribirProducto(Producto producto) 
            throws ArchivosExceptions{
        //softdrinks;Coca-cola;1.50;coca.jpeg
       
        ArrayList<Producto> productos = new ArrayList<>();
        File file = new File(App.class.getResource(ruta).getFile());
        try(BufferedWriter bw = new BufferedWriter(
                                    new FileWriter(file,true))){
            bw.newLine();
            String linea = producto.getTipo()+","+producto.getNombre()+","+String.valueOf(producto.getPrecio())+","+
                    producto.getImagen()
                    ;
            bw.write(linea);
            bw.close();
        }  catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw new ArchivosExceptions(ruta,ex.getMessage());
        }
        return productos;
        
}
     public static void sobreescribirProducto(ArrayList<Producto> productos) 
            throws ArchivosExceptions{
        File file = new File(App.class.getResource(ruta).getFile());
        try(BufferedWriter bw = new BufferedWriter(
                                    new FileWriter(file,true))){ 
            for(Producto p: productos){
                String linea = p.getTipo()+","+p.getNombre()+","+String.valueOf(p.getPrecio())+","+
                    p.getImagen()
                    ;
                bw.write(linea);
                bw.newLine();
            }
            
        }  catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw new ArchivosExceptions(ruta,ex.getMessage());
        }
        
        


}
     public static ArrayList<Producto> borrarArchivo() 
            throws ArchivosExceptions, IOException{
        
        try(InputStream input = App.class.getResource(ruta).openStream();
                BufferedReader bf = new BufferedReader(
                                    new InputStreamReader(input,"UTF-8"))){
            String linea;
            while((linea = bf.readLine())!=null){
                File file = new File(App.class.getResource(ruta).getFile());
                try(BufferedWriter bw = new BufferedWriter(
                                            new FileWriter(file))){
                    bw.newLine();
                    linea ="";
                            
                    bw.write(linea);
                    bw.close();
                    
            }catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw new ArchivosExceptions(ruta,ex.getMessage());        
        }}}  catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw new ArchivosExceptions(ruta,ex.getMessage());
        }
        return null;
    }
}
