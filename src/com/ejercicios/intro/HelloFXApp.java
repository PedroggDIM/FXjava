package com.ejercicios.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFXApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
// Crear un nodo VBox
		VBox root = new VBox();
// Crear un nodo Text
		Text msg = new Text("Hola a todos");
// Añadir el nodo Text al VBox como un nodo hijo
		root.getChildren().add(msg);
		Scene scene = new Scene(root, 400, 150);
		stage.setScene(scene);
		stage.setTitle("Presentando una aplicación con escena");
		stage.show();
	}
}