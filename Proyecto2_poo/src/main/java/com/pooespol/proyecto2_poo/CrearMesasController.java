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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nicol
 */
public class CrearMesasController implements Initializable {

    @FXML
    private Button btnCrear;
    @FXML
    private TextField txtnum;
    @FXML
    private TextField txtcapMesas;

    private Mesa mesa;
    private Pane pane;

    public void setMesaUbi(Ubicacion u) {
        this.mesa.setUbicacion(u);
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mesa = new Mesa(0, 0, new Ubicacion(0, 0));
        btnCrear.setOnMouseClicked((e) -> {
            try {
                agregarMesa();
                cerrarVentana(e);
            } catch (ArchivosExceptions ex) {
                ex.printStackTrace();
            }
        });
    }

    public Button getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(Button btnCrear) {
        this.btnCrear = btnCrear;
    }

    public TextField getTxtnum() {
        return txtnum;
    }

    public void setTxtnum(TextField txtnum) {
        this.txtnum = txtnum;
    }

    public TextField getTxtcapMesas() {
        return txtcapMesas;
    }

    public void setTxtcapMesas(TextField txtcapMesas) {
        this.txtcapMesas = txtcapMesas;
    }

    public void cerrarVentana(Event event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void agregarMesa() throws ArchivosExceptions {
        System.out.println("botoncrear");
        int numMesa = Integer.parseInt(getTxtnum().getText());
        int capacidad = Integer.parseInt(getTxtcapMesas().getText());
        Ubicacion u = mesa.getUbicacion();
        mesa = new Mesa(numMesa, capacidad, u);
        Circle c = new Circle(capacidad *10, Color.rgb(255, 220, 31));
        Label l = new Label("M" + String.valueOf(numMesa));
        StackPane contenedor = new StackPane();
        contenedor.setPrefHeight(100);
        contenedor.setPrefWidth(100);
        contenedor.getChildren().addAll(c, l);
        contenedor.setLayoutX(mesa.getUbicacion().getCoordenadaX());
        contenedor.setLayoutY(mesa.getUbicacion().getCoordenadaY());
        pane.getChildren().add(contenedor);
        AdministradorController.r.getListMesas().add(mesa);
        MesaData.escribirMesa(mesa);
        contenedor.setOnMouseDragged(event -> {
                    try {
                        double deltaX = event.getSceneX();
                        double deltaY = event.getSceneY();
                        contenedor.setLayoutX(deltaX);
                        contenedor.setLayoutY(deltaY);
                        Ubicacion ub = new Ubicacion(deltaX, deltaY);
                        mesa.setUbicacion(ub);
                        MesaData.borrarArchivoMesas();
                        MesaData.sobreescribirMesa(AdministradorController.r.getListMesas());
                    } catch (ArchivosExceptions ex) {
                        ex.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                });
    }

}
