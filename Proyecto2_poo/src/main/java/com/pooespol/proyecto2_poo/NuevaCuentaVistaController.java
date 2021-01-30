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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
/**
 * FXML Controller class
 *
 * @author Dustin Pisco
 */
public class NuevaCuentaVistaController implements Initializable {

    @FXML
    private TextField txtCliente;
    @FXML
    private Button btnCrearCuenta;
    @FXML
    private Label lblNroMesa;

    
    
    public Label getLblNroMesa() {
        return lblNroMesa;
    }

    public void setLblNroMesa(Label lblNroMesa) {
        this.lblNroMesa = lblNroMesa;
    }

    public TextField getTxtCliente() {
        return txtCliente;
    }

    public void setTxtCliente(TextField txtCliente) {
        this.txtCliente = txtCliente;
    }

    public Button getBtnCrearCuenta() {
        return btnCrearCuenta;
    }

    public void setBtnCrearCuenta(Button btnCrearCuenta) {
        this.btnCrearCuenta = btnCrearCuenta;
    }
  

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }



}
