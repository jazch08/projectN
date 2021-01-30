/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicol
 */
public class Usuario {
    private String email;
    private String password;

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Usuario usuarioExiste(Usuario u,List<Usuario> lusu) {
        for (Usuario c : lusu) {
            if (c.equals(u)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        //verificamos si el objeto no es null
        if (obj != null) {
            //verificamos que obj est ereferencioado a un objeto de tipo Empleado
            if (obj instanceof Usuario) {
                //hacemos casting para obtener una variables de tipo Empleado que referencia al obj al que esta apuntando obj este lo hacemos para poder tener acceso a los metodos de la clase Empleado
                Usuario other = (Usuario) obj;
                if (email.equals(other.getEmail()) && password.equals(other.getPassword())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", password=" + password + '}';
    }

    
}
