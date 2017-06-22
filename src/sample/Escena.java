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

        ChoiceBox<String> esquipoJugador1 = new ChoiceBox<>();
        esquipoJugador1.getItems().add("Guerreros Z");
        esquipoJugador1.getItems().add("Enemigos de la Tierra");

        ChoiceBox<String> esquipoJugador2 = new ChoiceBox<>();
        esquipoJugador2.getItems().add("Guerreros Z");
        esquipoJugador2.getItems().add("Enemigos de la Tierra");

        Label LblNombreJugador1 = new Label("Nombre J1:");
        TextField TxtNombreJugador1 = new TextField();
        HBox contenedorJ1 = new HBox(LblNombreJugador1, TxtNombreJugador1);

        Label LblNombreJugador2 = new Label("Nombre J2:");
        TextField TxtNombreJugador2 = new TextField();
        HBox contenedorJ2 = new HBox(LblNombreJugador2, TxtNombreJugador2);

        VBox pilaContenedores = new VBox(contenedorJ1,contenedorJ2);

        return new Scene(pilaContenedores,300,200);
    }

    public Scene PantallaPrincipalJuego(){

        return null;
    }
}
