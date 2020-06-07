package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	/* Atributo correspondente ao controle da tela */
	@FXML
	private Button btTest;
	
	/* Metodo responsavel por executar quando o botão for clicado */
	/* Action é a ação que ocorre no botão, o click*/
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
}
