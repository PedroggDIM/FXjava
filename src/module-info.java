

module FXejercicio101 {
	requires javafx.graphics;
	requires javafx.controls;
	requires java.desktop;
	requires javafx.swing;
	requires javafx.media; 
	requires javafx.web;
	requires javafx.fxml;
	requires jdk.jsobject;
	requires javafx.base;
	
	exports javaFX_cap02;
	exports javaFX_cap03;
		
	opens com.ejercicios.intro to javafx.graphics, javafx.base;
}