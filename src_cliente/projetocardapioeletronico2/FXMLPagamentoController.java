/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLPagamentoController implements Initializable {
    
        
    @FXML
    private TextField txtDividirConta;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnDividirConta(ActionEvent event) throws IOException {
        if(txtDividirConta.isEditable() == false){
            txtDividirConta.setText("");
            txtDividirConta.setVisible(true);
            txtDividirConta.setEditable(true);
        }
        else{
            txtDividirConta.setVisible(false);
            txtDividirConta.setEditable(false);
        }
    }
    
    @FXML
    private void btnConfirmarPagamento(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.fimPagamento);
    }
    
    @FXML
    private void btnCancelar(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.carrinho);
    }
    
    
    
    
}
