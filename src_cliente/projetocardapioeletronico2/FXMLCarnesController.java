
package projetocardapioeletronico2;

import dao.DaoProdutoCliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import projetocardapioeletronico2.classes.Produto;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLCarnesController implements Initializable {

    @FXML
    private Button btnMenuCarrinho;
    @FXML
    private Pane paneCane;
    @FXML
    private Button btnSair;
    @FXML
    private ScrollPane scrollPaneOriginal;

    private String conteudoPreco;
    private String conteudoNome;
    private String conteudoQtd;
     int a = 15;
    DaoProdutoCliente daoprodutoCarnes = new DaoProdutoCliente();
   

    FXMLPrincipalController pai;
    FXMLCarrinhoController carrinho;
    Parent parentTela;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            criarCategoriaCarnes();
        } catch (IOException ex) {
            Logger.getLogger(FXMLCarnesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnMenuCarrinho(ActionEvent event) throws IOException {
        //ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.carrinho)
        ProjetoCardapioEletronico2.scene.setRoot(parentTela);
    }

    @FXML
    private void btnSair(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.principal);
    }

    @FXML
    public void criarCategoriaCarnes() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("projetocardapioeletronico2/FXMLCarrinho.fxml"));

        Parent tela = loader.load();
        FXMLCarrinhoController controllerCarrinho = loader.getController();

        this.carrinho = controllerCarrinho;
        this.parentTela = tela;

        String categoria = "Carnes";

        for (Produto prd : daoprodutoCarnes.getbuscarProdutosBD()) {

            if (prd.getCategoria().equalsIgnoreCase(categoria)) {
                try {
                    FXMLLoader fxmll = new FXMLLoader(getClass().getResource("FXMLTelinhaProdutos.fxml"));
                    Parent telinhaProduto = (Parent) fxmll.load();
                    paneCane.getChildren().add(telinhaProduto);

                    FXMLTelinhaProdutosController controller = (FXMLTelinhaProdutosController) fxmll.getController();
                    controller.setLabels(prd.getNome(), prd.getDescricao(), prd.getPrecoUnitario(), prd.getImagem());

                    telinhaProduto.setTranslateX(10);
                    telinhaProduto.setTranslateY(a);
                    a = a + 185;

                    /**
                     * *******************************************************
                     */
                    FXMLTelinhaProdutosController telaProdutos = fxmll.getController();

                    telaProdutos.carregar(this.conteudoNome, this.conteudoPreco, this.conteudoQtd, controllerCarrinho);
                    /**
                     * *******************************************************
                     */

                } catch (IOException ex) {
                    Logger.getLogger(FXMLBebidasController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

}
