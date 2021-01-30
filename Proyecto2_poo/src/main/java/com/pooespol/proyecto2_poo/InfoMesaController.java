/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
/**
 * FXML Controller class
 *
 * @author Dustin Pisco
 */
public class InfoMesaController implements Initializable {


    @FXML
    private BorderPane pnVentEmer;
    @FXML
    private Label lblMesa;
    @FXML
    private Label lblCapacidad;
    @FXML
    private VBox cajaInfo;
    @FXML
    private Label lblMesero;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public Label getLblMesero() {
        return lblMesero;
    }

    public void setLblMesero(Label lblMesero) {
        this.lblMesero = lblMesero;
    }

    public VBox getCajaInfo() {
        return cajaInfo;
    }
    
    public Label getLblMesa() {
        return lblMesa;
    }

    public void setLblMesa(Label lblMesa) {
        this.lblMesa = lblMesa;
    }

    public Label getLblCapacidad() {
        return lblCapacidad;
    }

    public void setLblCapacidad(Label lblCapacidad) {
        this.lblCapacidad = lblCapacidad;
    }

}
