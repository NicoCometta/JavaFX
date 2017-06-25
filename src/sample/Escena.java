package sample;

import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;

/**
 * Created by nico on 22/06/17.
 */
public class Escena {

    public Scene PantallaEligirEquipos(){

        ChoiceBox<String> equipoJugador1 = new ChoiceBox<>();
        equipoJugador1.getItems().add("Guerreros Z");
        equipoJugador1.getItems().add("Enemigos de la Tierra");

        ChoiceBox<String> equipoJugador2 = new ChoiceBox<>();
        equipoJugador2.getItems().add("Guerreros Z");
        equipoJugador2.getItems().add("Enemigos de la Tierra");

        Label lblNombreJugador1 = new Label("Nombre J1:");
        TextField txtNombreJugador1 = new TextField();
        HBox contenedorJ1 = new HBox(50);

        contenedorJ1.getChildren().addAll(lblNombreJugador1, txtNombreJugador1, equipoJugador1);

        Label lblNombreJugador2 = new Label("Nombre J2:");
        TextField txtNombreJugador2 = new TextField();
        HBox contenedorJ2 = new HBox(50);

        contenedorJ2.getChildren().addAll(lblNombreJugador2, txtNombreJugador2, equipoJugador2);

        Button btnAceptar = new Button("Aceptar");


        //VBox pilaContenedores = new VBox(contenedorJ1,contenedorJ2);
        VBox pilaContenedores = new VBox(lblNombreJugador2,txtNombreJugador2,equipoJugador2);

        return new Scene(pilaContenedores,300,200);
    }

    public Scene PantallaPrincipalJuego(){

        return new Scene();
    }
}
