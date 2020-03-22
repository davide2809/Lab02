package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	AlienDictionary dizionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String testo= txtWord.getText();
    	try {
    		testo.toLowerCase();
    	} catch (Exception e) {
    		txtResult.appendText("Parola non valida!");
    	}
    	if(testo.contains(" ")) {
    		String[] text=testo.split(" ");
    		String alienWord=text[1];
    		String translation=text[2];
    		dizionario.addWord(alienWord, translation);
    	}
    	else {
    		String result=dizionario.translateWord(testo);
    		if(result==null)
    			txtResult.appendText("Parola inesistente!");
    		else
    			txtResult.appendText(result);
    		}
    	
    }

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        dizionario=new AlienDictionary();

    }
}
