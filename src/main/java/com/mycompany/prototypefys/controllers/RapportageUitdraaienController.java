package com.mycompany.prototypefys.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class RapportageUitdraaienController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    void on_Uitdraaien(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Rapportages");
        alert.setHeaderText("");
        alert.setContentText("Bezig met uitdraaien (1 van 20)");

        alert.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
