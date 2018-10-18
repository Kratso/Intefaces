/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorventanas1fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author alumno
 */
public class FXMLGestorVentas1Controller implements Initializable {
	
	@FXML
	private TextField nombreField;
	
	@FXML
	private Button botonAniadir;
	
	@FXML
    private Button botonAnterior;
	
	@FXML
    private Button botonBuscar;
	
	@FXML
    private Button botonCancelar;
	
	@FXML
    private Button botonEliminar;
	
	@FXML
    private Button botonPrimero;
	
	@FXML
    private Button botonSalir;
	
	@FXML
    private Button botonSiguiente;
	
	@FXML
    private Button botonUltimo;
	
	@FXML
    private ListView listaClientes;
	
	@FXML
    private ComboBox localidad;
	
	@FXML
    private RadioButton monitor1;
	
	@FXML
    private RadioButton monitor2;
	
	@FXML
    private RadioButton monitor3;
	
	@FXML
    private RadioButton monitor4;
	
	@FXML
    private ToggleGroup monitorGroup;
	
	@FXML
    private Label navegacionLabel;
	
	@FXML
    private CheckBox otros1;
	
	@FXML
    private CheckBox otros2;
	
	@FXML
    private CheckBox otros3;
	
	@FXML
    private CheckBox otros4;

	@FXML
    private RadioButton proc1;
	
	@FXML
    private RadioButton proc2;
	
	@FXML
    private RadioButton proc3;
	
	@FXML
    private RadioButton proc4;
	
	@FXML
    private ToggleGroup processorGroup;
	
	@FXML
    private RadioButton ram1;
	
	@FXML
    private RadioButton ram2;
	
	@FXML
    private RadioButton ram3;
	
	@FXML
    private RadioButton ram4;
	
	@FXML
    private ToggleGroup ramGroup;
	
	@FXML
    private RadioButton storage1;
	
	@FXML
    private RadioButton storage2;
	
	@FXML
    private RadioButton storage3;
	
	@FXML
    private RadioButton storage4;
	
	@FXML
    private ToggleGroup storageGroup;
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	
	
}
