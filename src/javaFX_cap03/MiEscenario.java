package javaFX_cap03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MiEscenario extends Application {
	public void start(Stage primaryStage) {
// Crear un botón y establecer una acción cuando se presiona
		Button btn = new Button();
		btn.setText("¡Haz clic aquí!");
		btn.setOnAction(event -> System.out.println("Hola, mundo!"));
// Crear un contenedor y agregar el botón
		StackPane root = new StackPane();
		root.getChildren().add(btn);
// Crear una escena y agregar el contenedor
		Scene scene = new Scene(root, 300, 250);
// Establecer la escena y mostrar la ventana
		primaryStage.setScene(scene);
		primaryStage.setTitle("Mi ventana JavaFX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}