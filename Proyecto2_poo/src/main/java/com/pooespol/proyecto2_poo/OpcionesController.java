/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo;


import com.pooespol.proyecto2_poo.data.MesaData;
import com.pooespol.proyecto2_poo.modelo.ArchivosExceptions;
import com.pooespol.proyecto2_poo.modelo.Mesa;
import com.pooespol.proyecto2_poo.modelo.Ubicacion;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author nicol
 */
public class OpcionesController implements Initializable {


    @FXML
    private Button btnEliminarM;
    @FXML
    private Button BtnModificarM;
    private Mesa mesa;
    public void setMesa(Mesa m) {
        this.mesa.setNumero(m.getNumero());
        this.mesa.setCapacidad(m.getCapacidad());
        this.mesa.setCuenta(m.getCuenta());
        this.mesa.setUbicacion(m.getUbicacion());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mesa = new Mesa(0, 0, new Ubicacion(0, 0));
        btnEliminarM.setOnMouseClicked((e) -> {
            try {
                eliminarMesa();
                cerrarVentanaEliminar(e);
            } catch (ArchivosExceptions ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }    

    public Button getBtnEliminarM() {
        return btnEliminarM;
    }

    public void setBtnEliminarM(Button btnEliminarM) {
        this.btnEliminarM = btnEliminarM;
    }

    public Button getBtnModificarM() {
        return BtnModificarM;
    }

    public void setBtnModificarM(Button BtnModificarM) {
        this.BtnModificarM = BtnModificarM;
    }
    @FXML
    public void cerrarVentanaEliminar(Event event) {
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
}
    public void eliminarMesa() throws ArchivosExceptions, IOException{
         //System.out.println(mesa);
         MesaData.borrarArchivoMesas();
         AdministradorController.r.borrarMesa(mesa);
         
        
         //MesaData.sobreescribirMesa(AdministradorController.r.getListMesas());
    }
}
