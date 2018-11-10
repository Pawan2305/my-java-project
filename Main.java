/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dt.projects.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pawankumar
 */
public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("adminPage.fxml"));
        //loader.setController(new FormController()); 
        
        Parent root = loader.load();
        
        AdminPageController controller = loader.getController();
        
        controller.setMain(this);
        
        stage.setScene(new Scene(root));
        
        stage.setTitle("Restaurant Billing");
        stage.show();
    }
    
    
    
    public static void main(String[] args) {
         launch(args);
    }
    
}
