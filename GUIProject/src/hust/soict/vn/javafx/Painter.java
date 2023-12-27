package hust.soict.vn.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application{
	@Override
	public void start(Stage stage) throws Exception {
	    try {
	        Parent root = FXMLLoader.load(getClass().getResource("/hust/soict/vn/javafx/Painter.fxml"));
	        Scene scene = new Scene(root);
	        stage.setTitle("Painter");
	        stage.setScene(scene);
	        stage.show();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		launch(args);
	}
}
