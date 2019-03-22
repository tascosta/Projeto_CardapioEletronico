/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author isabe
 */
public class ProjetoCardapioEletronico extends Application {
    
    public static Scene scene;
    public static Parent principal, login;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        principal = FXMLLoader.load(getClass().getResource("FXMLPrincipal.fxml"));
        login = FXMLLoader.load(getClass().getResource("FXMLTelaLogin.fxml"));
        
        scene = new Scene(login);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
