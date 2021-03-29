package it.polito.tdp.corsi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.corsi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<?> dropPeriodoDidattico;

    @FXML
    private Button btnStampa;

    @FXML
    private TableView<?> tblCorso;

    @FXML
    private TableColumn<?, ?> colCorso;

    @FXML
    private TableColumn<?, ?> colNIscritti;

    @FXML
    private ChoiceBox<?> dropCorsi;

    @FXML
    private Button btnCerca;

    @FXML
    private Label lblCorsoSelezionato;

    @FXML
    private TableView<?> tblStudenti;

    @FXML
    private TableColumn<?, ?> colNomeStudente;

    @FXML
    private TableColumn<?, ?> colCognomeStudente;

    @FXML
    private TableColumn<?, ?> colCDS;

    @FXML
    void doCerca(ActionEvent event) {

    }

    @FXML
    void doStampa(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert dropPeriodoDidattico != null : "fx:id=\"dropPeriodoDidattico\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnStampa != null : "fx:id=\"btnStampa\" was not injected: check your FXML file 'Scene.fxml'.";
        assert tblCorso != null : "fx:id=\"tblCorso\" was not injected: check your FXML file 'Scene.fxml'.";
        assert colCorso != null : "fx:id=\"colCorso\" was not injected: check your FXML file 'Scene.fxml'.";
        assert colNIscritti != null : "fx:id=\"colNIscritti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert dropCorsi != null : "fx:id=\"dropCorsi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblCorsoSelezionato != null : "fx:id=\"lblCorsoSelezionato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert tblStudenti != null : "fx:id=\"tblStudenti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert colNomeStudente != null : "fx:id=\"colNomeStudente\" was not injected: check your FXML file 'Scene.fxml'.";
        assert colCognomeStudente != null : "fx:id=\"colCognomeStudente\" was not injected: check your FXML file 'Scene.fxml'.";
        assert colCDS != null : "fx:id=\"colCDS\" was not injected: check your FXML file 'Scene.fxml'.";

    }

    public void setModel(Model m) {
    	this.model=m;
    }
}
