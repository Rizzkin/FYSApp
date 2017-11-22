/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototypefys.controllers;

import com.mycompany.prototypefys.MainApp;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 */
public class LoginController implements Initializable {

   

    @FXML
    void onLogin(ActionEvent event) throws IOException {
      //  MainApp theApp = new MainApp();
        // theApp.naarDeScherm("/schermen/navigatie.fxml");
        System.out.println("inloggen");
        Parent parent1 = FXMLLoader.load(getClass().getResource("/schermen/navigatie.fxml"));
        Scene scene = new Scene(parent1);
        Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
        
    }
    
    @FXML
    void onLogin_supervisor(ActionEvent event) throws IOException {
        Parent parent1 = FXMLLoader.load(getClass().getResource("/schermen/navigatie_supervisor.fxml"));
        Scene scene = new Scene(parent1);
        Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @FXML
    void onAfsluiten(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    void OnHelpScherm(ActionEvent event) throws IOException {
        Parent parent1 = FXMLLoader.load(getClass().getResource("/schermen/HelpScherm.fxml"));
        Scene scene = new Scene(parent1);
        Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
