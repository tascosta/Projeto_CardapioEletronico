/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import projetocardapioeletronico2.classes.ThreadPromocao;

/**
 *
 * @author isabe
 */
public class ProjetoCardapioEletronico2 extends Application {
   
    public static Scene scene;
    public static Parent principal, carrinho, pagamento, fimPagamento, gostariaAvaliar, avaliacao, fimAvaliacao, cadastrar;
    public static Parent carnes, saladas, sobremesas, bebidas, massas, pizzas;
    
    @Override
    public void start(Stage stage) throws Exception {
        principal = FXMLLoader.load(getClass().getResource("FXMLPrincipal.fxml"));
        carrinho = FXMLLoader.load(getClass().getResource("FXMLCarrinho.fxml"));
        pagamento = FXMLLoader.load(getClass().getResource("FXMLPagamento.fxml"));
        fimPagamento = FXMLLoader.load(getClass().getResource("FXMLFimPagamento.fxml"));
        gostariaAvaliar = FXMLLoader.load(getClass().getResource("FXMLGostariaAvaliar.fxml"));
        avaliacao = FXMLLoader.load(getClass().getResource("FXMLAvaliacao.fxml"));
        fimAvaliacao = FXMLLoader.load(getClass().getResource("FXMLFimAvaliacao.fxml"));
        cadastrar = FXMLLoader.load(getClass().getResource("FXMLCadastroCliente.fxml"));
        
        
        carnes = FXMLLoader.load(getClass().getResource("FXMLCarnes.fxml"));
        saladas = FXMLLoader.load(getClass().getResource("FXMLSaladas.fxml"));
        sobremesas = FXMLLoader.load(getClass().getResource("FXMLSobremesas.fxml"));
        bebidas = FXMLLoader.load(getClass().getResource("FXMLBebidas.fxml"));
        massas = FXMLLoader.load(getClass().getResource("FXMLMassas.fxml"));
        pizzas = FXMLLoader.load(getClass().getResource("FXMLPizzas.fxml"));
        
        
        scene = new Scene(principal);
        
        stage.setScene(scene);
        stage.show();
        
        new ThreadPromocao().start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
