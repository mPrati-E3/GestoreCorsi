package it.polito.tdp.corsi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.corsi.model.Corso;
import it.polito.tdp.corsi.model.Model;
import it.polito.tdp.corsi.model.Studente;
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
    private ChoiceBox<String> dropPeriodoDidattico;

    @FXML
    private Button btnStampa;

    @FXML
    private TableView<Corso> tblCorso;

    @FXML
    private TableColumn<Corso, String> colCorso;

    @FXML
    private TableColumn<Corso, Integer> colNIscritti;

    @FXML
    private ChoiceBox<String> dropCorsi;

    @FXML
    private Button btnCerca;

    @FXML
    private Label lblCorsoSelezionato;

    @FXML
    private TableView<Studente> tblStudenti;

    @FXML
    private TableColumn<Studente, String> colNomeStudente;

    @FXML
    private TableColumn<Studente, String> colCognomeStudente;

    @FXML
    private TableColumn<Studente, String> colCDS;

    @FXML
    void doCerca(ActionEvent event) {
    	
    	List<Studente> StudentiDaStampare = this.model.StampaStudenti(dropCorsi.getValue());
    	
    	for ( int i = 0; i<tblStudenti.getItems().size(); i++) {
    	    tblStudenti.getItems().clear();
    	}
    	
    	//i valori saranno entrati nella table?
        for (int i=0; i<StudentiDaStampare.size(); i++) {
        	tblStudenti.getItems().add(StudentiDaStampare.get(i));
        }

    }

    @FXML
    void doStampa(ActionEvent event) {
    	
    	List<Corso> CorsiDaStampare = this.model.StampaCorsi(dropPeriodoDidattico.getValue());
    	
    	for ( int i = 0; i<tblCorso.getItems().size(); i++) {
    	    tblCorso.getItems().clear();
    	}
    	
    	//i valori saranno entrati nella table?
        for (int i=0; i<CorsiDaStampare.size(); i++) {
        	tblCorso.getItems().add(CorsiDaStampare.get(i));
        }
    	

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
        
        dropPeriodoDidattico.getItems().add("Primo Semestre");
        dropPeriodoDidattico.getItems().add("Secondo Semestre");
        
        //fare anche per l'altra drop
        /*for (int i=0; i<this.model.DammiTuttiCorsi.size(); i++) {
        	dropPeriodoDidattico.getItems().add("");
        }*/

    }

    public void setModel(Model m) {
    	this.model=m;
    }
}
