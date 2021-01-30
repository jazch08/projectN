/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyecto2_poo;

import com.pooespol.proyecto2_poo.modelo.Administrador;
import com.pooespol.proyecto2_poo.modelo.Mesero;
import com.pooespol.proyecto2_poo.modelo.Restaurante;
import com.pooespol.proyecto2_poo.modelo.Usuario;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author nicol
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtContra;
    @FXML
    private Button btLogin;
    Restaurante r;

    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {

    }

    public TextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(TextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public TextField getTxtContra() {
        return txtContra;
    }

    public void setTxtContra(TextField txtContra) {
        this.txtContra = txtContra;
    }

    public Button getBtLogin() {
        return btLogin;
    }

    public void setBtLogin(Button btLogin) {
        this.btLogin = btLogin;
    }

    public Restaurante getR() {
        return r;
    }

    public void setR(Restaurante r) {
        this.r = r;
    }

    @FXML
    private void mostrarLogin(MouseEvent event) throws IOException {

        try {
            String email = txtEmail.getText();
            String contraseña = txtContra.getText();

            if (email == null) {
                throw new NullPointerException("Email no puede er vacio");
            }
            if (contraseña == null) {
                throw new NullPointerException("Contraseña no puede er vacio");
            }

            Restaurante r = new Restaurante();
            Usuario u = new Usuario(email, contraseña);
            Usuario c = u.usuarioExiste(u, r.getListUsuarios());
            Label lb = new Label();
            if (c == null) {
                lb.setText("Credenciales Invalidas");
            } else {
                if (c instanceof Mesero) {
                    App.setRoot("mesero");

                } else if (c instanceof Administrador) {
                    App.setRoot("administrador");
                }
            }
        } catch (NullPointerException ex) {

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
