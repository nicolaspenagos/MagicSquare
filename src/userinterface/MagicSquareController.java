package userinterface;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import model.MagicSquare;

public class MagicSquareController {
	
	private MagicSquare mS1;
	

    @FXML
    private TextField txtF1;

    @FXML
    private ComboBox<?> comboBox1;

    @FXML
    private ComboBox<?> comboBox2;

    @FXML
    private Label lbResult;
    
    @FXML
    private Pane paneForGrid;
    
    @FXML
    void solve(ActionEvent event) {
    	int matrixSize = Integer.parseInt(txtF1.getText());
    	String option1 = String.valueOf(comboBox1.getValue());
    	String option2 = String.valueOf(comboBox2.getValue()); 
    	
    	
    	mS1 = new MagicSquare(matrixSize);
    	mS1.checker(option1, option2);
    	lbResult.setText(mS1.message());
    	GridPane grid = new GridPane();
    	Label lb1=new Label("Holaa");
    	
    	
    	
    
    	
    
    	
    }

}
