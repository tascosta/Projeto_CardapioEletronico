/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico2;

import dao.DaoProdutoCliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import projetocardapioeletronico2.classes.Produto;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLPrincipalController implements Initializable {

    @FXML
    private AnchorPane PanePrincipal;
    @FXML
    private Button btnMenuCliente;
    @FXML
    private Button btnMenuCarrinho;
    @FXML
    private Button btnCarnes;
    @FXML
    private Button btnSaladas;
    @FXML
    private Button btnSobremesas;
    @FXML
    private Button btnBebidas;
    @FXML
    private Button btnMassas;
    @FXML
    private Button btnPizzas;
    @FXML
    private Pane PaneCliente;
    @FXML
    private Button btnSairPaneLogin;

    @FXML
    private Button btnEntrar;

    @FXML
    private Pane PaneCadastrarUsuario;

    @FXML
    private Pane PaneEntrarUsuario;

    @FXML
    private Button btnVoltarLogin;

    @FXML
    private Button btnSairFazerLogin;

    @FXML
    private Pane PaneClienteLogado;

    @FXML
    private Button btnSair;

    @FXML
    private ImageView imagePromocao;

    //DaoProdutoCliente daoproduto = new DaoProdutoCliente();
    //Image[] imagens = new Image[3];


    FXMLPrincipalController root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        root = this;
    }

    @FXML
    private void btnMenuCliente(ActionEvent event) {
        PaneCliente.setVisible(true);
    }

    @FXML
    private void btnMenuCarrinho(ActionEvent event) throws IOException {

        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.carrinho);

    }

    @FXML
    private void btnCarnes(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.carnes);
    }

    @FXML
    private void btnSaladas(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.saladas);
    }

    @FXML
    private void btnSobremesas(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.sobremesas);
    }

    @FXML
    private void btnBebidas(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.bebidas);

    }

    @FXML
    private void btnMassas(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.massas);
    }

    @FXML
    private void btnPizzas(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.pizzas);
    }

    @FXML
    private void btnSairPaneLogin(ActionEvent event) throws IOException {
        PaneCliente.setVisible(false);
    }

    @FXML
    private void btnEntrar(ActionEvent event) throws IOException {
        PaneEntrarUsuario.setVisible(true);
    }

    @FXML
    private void btnVoltarLogin(ActionEvent event) throws IOException {
        PaneEntrarUsuario.setVisible(false);
    }

    @FXML
    private void btnSairFazerLogin(ActionEvent event) throws IOException {
        PaneEntrarUsuario.setVisible(false);
        PaneCliente.setVisible(false);
    }

    @FXML
    private void btnEntrarLogado(ActionEvent event) throws IOException {
        PaneClienteLogado.setVisible(true);
    }

    @FXML
    private void btnSairLogin(ActionEvent event) throws IOException {
        PaneEntrarUsuario.setVisible(false);
        PaneCliente.setVisible(false);
        PaneClienteLogado.setVisible(false);
    }

    @FXML
    private void btnCadastrar(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.cadastrar);
    }

    /*public void run() throws InterruptedException {
        Image img;
        String categoria = "Promoção";

        for (Produto prd : daoproduto.getbuscarProdutosBD()) {

            if (prd.getCategoria().equalsIgnoreCase(categoria)) {

                img = prd.getImagem();

                for (int i = 0; i < 3; i++) {
                    imagens[i] = img;

                }

            }
        }
        for (int i = 0; i < 3; i++) {

            imagePromocao.setImage(imagens[i]);
            Thread.sleep(100);
            if (i == 2) {
                i = -1;
            }
        }

    }*/
    
    public void minhaThread(Image imagem){
        imagePromocao.setImage(imagem);
    }

}
