/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtesting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author alumno
 */
public class FXMLTestingController implements Initializable {
	
	@FXML
	private Label label;
	
	@FXML
	private TextField textfield;
	
	@FXML
	public void handleButtonAction(KeyEvent evt){
		if(evt.getCode().equals(KeyCode.ENTER)){
			label.setText(textfield.getText());
		}
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	
	
}
