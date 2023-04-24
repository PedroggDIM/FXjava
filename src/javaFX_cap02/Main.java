package javaFX_cap02;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javaFX_cap02.Persona;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Persona person = new Persona(); // crea una instancia del JavaBean
		person.setNombre("Juan");
		person.setEdad(30);

		Label label = new Label(); // crea un componente Label
           // enlaza la propiedda "nombre" del JavaBean con el texto del Label
	//	label.textProperty().bind(person.nombreProperty());
		VBox vbox = new VBox(label); // crea un contenedor VBox y agrega el Label al mismo
		Scene scene = new Scene(vbox, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}