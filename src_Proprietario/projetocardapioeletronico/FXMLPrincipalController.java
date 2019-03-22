/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.StackPane;

/**
 *
 * @author isabe
 */
public class FXMLPrincipalController implements Initializable {
    
   
    
    @FXML
    private Button btnAdicionarProdutos;
    @FXML
    private StackPane PanePrincipal;
    @FXML
    private Button btnAlterarProdutos;
    @FXML
    private Button btnRemoverProdutos;
    @FXML
    private Button btnRelatorioVendas;
    @FXML
    private Button btnRelatorioFeedBack;
    @FXML
    private Button btnCadastrar;
    
    @FXML
    private void btnAdicionarProdutos(ActionEvent event) throws IOException {
      
        Parent root = FXMLLoader.load(getClass().getResource("FXMLAdicionarProdutos.fxml"));
        
        PanePrincipal.getChildren().clear();
        PanePrincipal.getChildren().add(root);
        
    }
    
    @FXML
    private void btnAlterarProdutos(ActionEvent event) throws IOException {
      
        Parent root = FXMLLoader.load(getClass().getResource("FXMLAlterarProdutos.fxml"));
        
        PanePrincipal.getChildren().clear();
        PanePrincipal.getChildren().add(root);
        
    }
    
    @FXML
    private void btnRemoverProdutos(ActionEvent event) throws IOException {
      
        Parent root = FXMLLoader.load(getClass().getResource("FXMLRemoverProdutos.fxml"));
        
        PanePrincipal.getChildren().clear();
        PanePrincipal.getChildren().add(root);
        
    }
    
    @FXML
    private void btnRelatorioVendas(ActionEvent event) throws IOException {
      
        Parent root = FXMLLoader.load(getClass().getResource("FXMLRelatorioVendas.fxml"));
        
        PanePrincipal.getChildren().clear();
        PanePrincipal.getChildren().add(root);
        
    }
    
    @FXML
    private void btnRelatorioFeedBack(ActionEvent event) throws IOException {
      
        Parent root = FXMLLoader.load(getClass().getResource("FXMLRelatorioFeedBack.fxml"));
        
        PanePrincipal.getChildren().clear();
        PanePrincipal.getChildren().add(root);
        
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCadastrar(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLCadastrarADM.fxml"));
        
        PanePrincipal.getChildren().clear();
        PanePrincipal.getChildren().add(root);
    }
    
}
