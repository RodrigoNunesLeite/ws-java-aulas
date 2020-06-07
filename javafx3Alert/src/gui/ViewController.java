package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	/* Atributo correspondente ao controle da tela */
	@FXML
	private Button btTest;
	
	/* Metodo responsavel por executar quando o bot�o for clicado */
	/* Action � a a��o que ocorre no bot�o, o click*/
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR);
	}
}
