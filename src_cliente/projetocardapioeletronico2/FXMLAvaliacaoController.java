/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico2;

import dao.DaoFeedbackCliente;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import projetocardapioeletronico2.classes.Feedback;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLAvaliacaoController implements Initializable {

    DaoFeedbackCliente feedBack  = new DaoFeedbackCliente();
    private int atendimento = 0;
    private int ambiente = 0;
    private int servico = 0;
    private int produto = 0;
    private int cardapio = 0;
    @FXML
    private Button btnEnviarFeedBack;
    @FXML
    private Button btnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Button btnAtendimentoRuim;
    @FXML
    private Button btnAtendimentoBom;
    @FXML
    private Button btnAtendimentoOtimo;
    @FXML
    private Button btnAmbienteRuim;
    @FXML
    private Button btnAmbienteBom;
    @FXML
    private Button btnAmbienteOtimo;
    @FXML
    private Button btnServicoRuim;
    @FXML
    private Button btnServicoBom;
    @FXML
    private Button btnServicoOtimo;
    @FXML
    private Button btnProdutoRuim;
    @FXML
    private Button btnProdutoBom;
    @FXML
    private Button btnProdutoOtimo;
    @FXML
    private Button btnCardapioEletronicoRuim;
    @FXML
    private Button btnCardapioEletronicoBom;
    @FXML
    private Button btnCardapioEletronicoOtimo;

    @FXML
    private void btnAtendimentoRuim(ActionEvent event)throws IOException {
        
        atendimento = 1;
    }

    @FXML
    private void bbtnAtendimentoBom(ActionEvent event)throws IOException {
        atendimento = 2;
    }

    @FXML
    private void btnAtendimentoOtimo(ActionEvent event)throws IOException {
        atendimento = 3;
    }

    @FXML
    private void btnAmbienteRuim(ActionEvent event) throws IOException{
        ambiente = 1;
    }

    @FXML
    private void btnAmbienteBom(ActionEvent event)throws IOException {
        ambiente = 2;
    }

    @FXML
    private void btnAmbienteOtimo(ActionEvent event)throws IOException {
        ambiente = 3;
    }

    @FXML
    private void btnServicoRuim(ActionEvent event)throws IOException {
        servico = 1;
    }

    @FXML
    private void btnServicoBom(ActionEvent event)throws IOException {
        servico = 2;
    }

    @FXML
    private void btnServicoOtimo(ActionEvent event)throws IOException {
        servico = 3;
    }

    @FXML
    private void btnProdutoRuim(ActionEvent event)throws IOException {
        produto = 1;
    }

    @FXML
    private void btnProdutoBom(ActionEvent event)throws IOException {
        produto = 2;
    }

    @FXML
    private void btnProdutoOtimo(ActionEvent event)throws IOException {
        produto = 3;
    }

    @FXML
    private void btnCardapioEletronicoRuim(ActionEvent event)throws IOException {
        cardapio = 1;
    }

    @FXML
    private void btnCardapioEletronicoBom(ActionEvent event)throws IOException {
        cardapio = 2;
    }

    @FXML
    private void btnCardapioEletronicoOtimo(ActionEvent event)throws IOException {
        cardapio = 3;
    }

    @FXML
    private void btnEnviarFeedBack(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.fimAvaliacao);
        feedBack.inserirBd(atendimento, produto, servico, ambiente, cardapio);
 
    }

    @FXML
    private void btnCancelar(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.principal);
    }

    
    @FXML
    private void btnAtendimentoRuim(DragEvent event) {
    }

    @FXML
    private void btnAtendimentoRuim(MouseEvent event) {
        btnAtendimentoRuim.setOnAction(setFill(Color.RED));
    }

    @FXML
    private void btnAtendimentoRuim(MouseDragEvent event) {
          btnAtendimentoRuim.setOnAction(setFill(Color.BLUE));
    }

    private EventHandler<ActionEvent> setFill(Color BLUE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
