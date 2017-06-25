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
        primaryStage.setTitle("DragonAlgoBall - TP2 Algoritmos III. FIUBA");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/EscenaInicio.fxml"));

        Scene miEscena = new Scene(root);

        primaryStage.setScene(miEscena);
        primaryStage.show();
    }

}
