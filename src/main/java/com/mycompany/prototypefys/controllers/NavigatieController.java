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
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class NavigatieController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private StackPane all_content;

    @FXML
    void onFormulierenWijzigen(ActionEvent event) {

    }

    @FXML
    void onGevonden_bagage(ActionEvent event) {
        veranderContentNode("Gevondenbagage.fxml");
    }

    @FXML
    void onInstellingen(ActionEvent event) {
        veranderContentNode("Instellingen.fxml");
    }

    @FXML
    void onRegistraties_inlezen(ActionEvent event) {
        veranderContentNode("Registraties_inlezen.fxml");
    }

    @FXML
    void onSchade_claim(ActionEvent event) {
        veranderContentNode("Schadeclaim.fxml");
    }

    @FXML
    void onZoeken(ActionEvent event) {
        veranderContentNode("Zoeken.fxml");
    }

    @FXML
    void onUitgebreid_zoeken(ActionEvent event) {
        veranderContentNode("UitgebreidZoeken.fxml");
    }

    @FXML
    void onUitloggen(ActionEvent event) throws IOException {

        Parent parent1 = FXMLLoader.load(getClass().getResource("/schermen/Login.fxml"));
        Scene scene = new Scene(parent1);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @FXML
    void onVerloren_bagage(ActionEvent event) {
        veranderContentNode("Verlorenbagage.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void veranderContentNode(String schermFileName) {
        Parent parent;
        try {
            parent = AppUtilities.loadScreen(schermFileName);
        } catch (IOException ex) {
            ex.printStackTrace();
            // TODO show error
            return;
        }
        // veranderContentNode("UitgebreidZoeken.fxml");
        all_content.getChildren().setAll(parent);
    }

}
