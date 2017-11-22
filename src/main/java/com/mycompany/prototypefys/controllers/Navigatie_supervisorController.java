package com.mycompany.prototypefys.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.prototypefys.AppUtilities;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class Navigatie_supervisorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private StackPane all_content_supervisor;
    
    
    @FXML
    void onFormulieren_wijzigen(ActionEvent event) {
        veranderContentNode_supervisor("FormulierWijzigen.fxml");
    }

    @FXML
    void onInstellingen_supervisor(ActionEvent event) {
        veranderContentNode_supervisor("Instellingen_supervisor.fxml");
    }

    @FXML
    void onMederwerkers_beheren(ActionEvent event) {
        veranderContentNode_supervisor("MedewerkersBeheren.fxml");
    }

    @FXML
    void onMedewerkers_Toevoegen(ActionEvent event) {
        veranderContentNode_supervisor("MedewerkerToevoegen.fxml");
    }

    @FXML
    void onRapportages_uitdraaien(ActionEvent event) {
        veranderContentNode_supervisor("RapportageUitdraaien.fxml");
    }

    @FXML
    void onUitloggen_supervisor(ActionEvent event) throws IOException {
        
        Parent parent1 = FXMLLoader.load(getClass().getResource("/schermen/Login.fxml"));
        Scene scene = new Scene(parent1);
        Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void veranderContentNode_supervisor(String schermFileName){
        Parent parent;
        try {
            parent = AppUtilities.loadScreen(schermFileName);
        } catch (IOException ex) {
            ex.printStackTrace();
            // TODO show error
            return;
        }
        // veranderContentNode("UitgebreidZoeken.fxml");
        all_content_supervisor.getChildren().setAll(parent);
    }
    
}
