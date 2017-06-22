package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage ventanaPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventanaPrincipal = primaryStage;
        ventanaPrincipal.setTitle("DragonAlgoBall - TP2 Algoritmos III. FIUBA");

        //Definir 2 scenes:
        //la primera es donde se inicializan los jugadores y los equipos que elejin cada uno
        // la segunda es ya el tablero dibujado con los equipos posicionados, listo para jugar.

        //NOTAS:
        //Definir un "Menu" superior, siempre mantener 2 opciones para que el usuario pueda realizar una accion.

        ventanaPrincipal.show();
        /*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        */
    }

}
