/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorventanas1fx;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Vector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author alumno
 */
public class FXMLGestorVentas1Controller implements Initializable {

	private final Vector<String> clientes = new Vector<>();
	private final Vector<Venta> ventas = new Vector<>();
	private final ArrayList<Venta> busqueda = new ArrayList<>();
	private int index;

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
	
	private final Venta ventaBase = new Venta("Villalba", proc3, ram2, monitor1, storage4, true, true, false, false);


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		listaClientes = new ListView<String>();
		ObservableList<String> items = FXCollections.observableArrayList(
				"Villalba", "Alpedrete", "Moralzarzal", "Galapagar", "Guadarrama");
		listaClientes.setItems(items);
	}

	@FXML
	private void nombreFieldKeyPressed(KeyEvent evt) {
		if (evt.getCode().equals(KeyCode.ENTER) && valido(nombreField.getText())) {
			setVenta(ventaBase, true);
			localidad.requestFocus();
			toggleControls(true);
			botonEliminar.setDisable(false);
		}
	}

	@FXML
	private void botonAnteriorActionPerformed(ActionEvent evt) {

	}

	@FXML
	private void botonCancelarOnActionEvent(ActionEvent evt) {

	}

	@FXML
	private void botonSalirOnActionEvent(ActionEvent evt) {

	}

	@FXML
	private void botonAñadirOnActionEvent(ActionEvent evt) {

	}

	@FXML
	private void botonEliminarOnActionEvent(ActionEvent evt) {

	}

	@FXML
	private void botonPrimeroOnActionPerformed(ActionEvent evt) {

	}

	@FXML
	private void botonUltimoOnActionPerformed(ActionEvent evt) {

	}

	@FXML
	private void botonSiguienteOnActionPerformed(ActionEvent evt) {

	}

	@FXML
	private void botonBuscarOnActionPerformed(ActionEvent evt) {

	}

	@FXML
	private void listaClientesOnMouseClicked(ActionEvent evt) {

	}

	private boolean valido(String text) {
		return text.matches("([a-zA-Z.\\-]+[ ]?)+");
	}

	private void toggleControls(boolean toggle) {
		localidad.setDisable(!toggle);

		proc1.setDisable(!toggle);
		proc2.setDisable(!toggle);
		proc3.setDisable(!toggle);
		proc4.setDisable(!toggle);

		monitor1.setDisable(!toggle);
		monitor2.setDisable(!toggle);
		monitor3.setDisable(!toggle);
		monitor4.setDisable(!toggle);

		ram1.setDisable(!toggle);
		ram2.setDisable(!toggle);
		ram3.setDisable(!toggle);
		ram4.setDisable(!toggle);

		storage1.setDisable(!toggle);
		storage2.setDisable(!toggle);
		storage3.setDisable(!toggle);
		storage4.setDisable(!toggle);

		otros1.setDisable(!toggle);
		otros2.setDisable(!toggle);
		otros3.setDisable(!toggle);
		otros4.setDisable(!toggle);

		botonAniadir.setDisable(!toggle);
		botonBuscar.setDisable(!toggle);
	}

	private void setVenta(Venta ventaBase, boolean b) {
		if(b)
			localidad.getSelectionModel().select(ventaBase.getLocalizacion());
		processorGroup.selectToggle(ventaBase.getProcesador());
		ramGroup.selectToggle(ventaBase.getRam());
		monitorGroup.selectToggle(ventaBase.getMonitor());
		storageGroup.selectToggle(ventaBase.getAlmacenamiento());
		otros1.setSelected(ventaBase.isOtro1());
		otros2.setSelected(ventaBase.isOtro2());
		otros3.setSelected(ventaBase.isOtro3());
		otros4.setSelected(ventaBase.isOtro4());
	}

}
