package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {
	
	@FXML
	private TextField txtNumero1;
	@FXML
	private TextField txtNumero2;
	@FXML
	private Label labelResult;
	@FXML
	private Button btsun;
	
	@FXML 
	public void onBtAction() {
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumero1.getText());
		double number2 = Double.parseDouble(txtNumero2.getText());
		double sun = number1 + number2;
		labelResult.setText(String.format("%.2f",sun));
		}catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
			// TODO: handle exception
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumero1);
		Constraints.setTextFieldDouble(txtNumero2);
		Constraints.setTextFieldMaxLength(txtNumero1, 2);
		Constraints.setTextFieldMaxLength(txtNumero2, 2);
		
	}

	
	

}
