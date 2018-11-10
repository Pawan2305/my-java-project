/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dt.projects.client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author pawankumar
 */
public class AdminPageController implements Initializable {
    private Main main;
    
    @FXML
    private Pane adminStage;
    /**
     * Initializes the controller class.
     */
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onStaff(Event event) throws IOException {
        
        AnchorPane pane = FXMLLoader.load(getClass().getResource("staff.fxml"));
        adminStage.getChildren().setAll(pane);
    }

    @FXML
    private void onCustomer(Event event) {
    }

    @FXML
    private void onMenu(Event event) {
    }

    @FXML
    private void onBill(Event event) {
    }

    @FXML
    private void onLogout(Event event) {
    }
    
    public void setMain(Main main)
    {
        this.main=main;
    }
}
