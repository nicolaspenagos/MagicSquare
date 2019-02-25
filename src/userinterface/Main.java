package userinterface;

import javafx.scene.Parent;
import userinterface.MagicSquareController;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MagicSquare.fxml"));
		Scene scene = new Scene(root); 
		primaryStage.setTitle("MagicSquare");
	
		
    	GridPane gridPane = new GridPane();
    	Label prueba=new Label("pruba"); 
    	gridPane.add(prueba, 0, 1);
    
		
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
	}

}
