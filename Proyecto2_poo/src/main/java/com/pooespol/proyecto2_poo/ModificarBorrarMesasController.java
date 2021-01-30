/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nicol
 */
public class ModificarBorrarMesasController implements Initializable {

    @FXML
    private TextField txtinfoNum;
    @FXML
    private TextField txtInfoCap;
    @FXML
    private Button btmModificarMesa;
    @FXML
    private TextField txtMesero;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
   

    public TextField getTxtinfoNum() {
        return txtinfoNum;
    }

    public void setTxtinfoNum(TextField txtinfoNum) {
        this.txtinfoNum = txtinfoNum;
    }

    public TextField getTxtInfoCap() {
        return txtInfoCap;
    }

    public void setTxtInfoCap(TextField txtInfoCap) {
        this.txtInfoCap = txtInfoCap;
    }

    public Button getBtmModificarMesa() {
        return btmModificarMesa;
    }

    public void setBtmModificarMesa(Button btmModificarMesa) {
        this.btmModificarMesa = btmModificarMesa;
    }

    public TextField getTxtMesero() {
        return txtMesero;
    }

    public void setTxtMesero(TextField txtMesero) {
        this.txtMesero = txtMesero;
    }
     @FXML
    public void cerrarVentanaModificar(Event event) {
 
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    
}
}
