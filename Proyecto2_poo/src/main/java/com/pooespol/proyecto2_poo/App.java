package com.pooespol.proyecto2_poo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Ya pude conectarme amigues att 2tin//
//actualizacion//
//Ya se soluciono amigues//
/**
 * *
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
//

    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("administrador.fxml"));
            Parent root = fxmlLoader.load();
            //cree el scene y fije como nodo raiz el objeto que cargo con el fxml
            scene = new Scene(root);
        } catch (IOException ex) {
            //si llegamos a este punto es porque no se pudo cargar del archivo
            //reporte.fxml el scenegraph
            //creamos con programacion un nuevo roort y lo fijamos a la scena
            VBox v = new VBox(new Label("No se cargo el archivo "));
            ex.getStackTrace();
            scene = new Scene(v);
            System.out.println(ex);

        }

        //fije la scena al primary stage
        stage.setScene(scene);

        //muestre la aplicacion
        stage.show();
    }

    static void setRoot(String fxml) {
        try {
            scene.setRoot(loadFXML(fxml));
        } catch (IOException ex) {
            System.out.println("Algo sucedio");
            System.out.println(ex);
            ex.getStackTrace();
        }

    }

    static void setRoot(Parent root) {
        scene.setRoot(root);
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) throws IOException {

        launch();
    }

}
