/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorterminalimpostor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author krats
 */
public class TerminalImpostorFXMLController implements Initializable {
    
    @FXML
    private TextField command_prompt;

    @FXML
    private TextArea text_area;

    private static Set<String> commandSet = new TreeSet();
    private static int currentCommand;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void executeLine(KeyEvent event) throws IOException{
        if (event.getCode().isArrowKey()) {
            if (event.getCode().equals(KeyCode.UP)) {
                if(currentCommand == 0){
                    currentCommand = commandSet.size();
                }
                if (currentCommand > 0) {
                    command_prompt.setText((String) commandSet.toArray()[currentCommand - 1]);
                }
            } else if (event.getCode().equals(KeyCode.DOWN)) {
                currentCommand++;
                if (currentCommand < commandSet.size()) {
                    command_prompt.setText((String) commandSet.toArray()[currentCommand - 1]);
                } else {
                    command_prompt.setText("");
                    currentCommand = 0;
                }
            }
        } else {
            if (event.getCode().equals(KeyCode.ENTER)) {
                String command = command_prompt.getText();
                commandSet.add(command);
                parseCommand(command);
                currentCommand = 0;
                command_prompt.setText("");
                String area = "";
                for(String s : commandSet){
                    area += s + "\n";
                }
                text_area.setText(area);
            }
        }
    }

    private void parseCommand(String command) {
        System.out.println("klsjdndlsfnm");
    }

}
