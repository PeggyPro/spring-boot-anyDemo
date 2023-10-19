package com.hjt;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent main = FXMLLoader.load(getClass().getResource("/main.fxml"));
		primaryStage.setTitle("工具类");
		primaryStage.setScene(new Scene(main));
		primaryStage.show();
	}
    
    public static void main(String[] args) {
        launch(args);
    }

}
