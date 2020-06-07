package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController implements Initializable{
	
	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	/* Atributo correspondente ao controle da tela */
	@FXML
	private Button btSum;
	
	/* Metodo responsavel por executar quando o botão for clicado */
	/* Action é a ação que ocorre no botão, o click*/
	@FXML
	public void onBtSumAction() {
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(),  AlertType.ERROR);
		}
		
	}

	// ações executadas no quando o controlador for criado
	// url = é o endereço da tela
	// rb = recursos que podem ser usados na implementação
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 12);
		Constraints.setTextFieldMaxLength(txtNumber2, 12);
	}
}
