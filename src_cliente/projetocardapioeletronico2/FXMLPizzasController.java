
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
import javafx.scene.layout.Pane;
import projetocardapioeletronico2.classes.Produto;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLPizzasController implements Initializable {

    int a = 15;

    @FXML
    private Button btnMenuCarrinho;
    @FXML
    private Pane panePizza;
    DaoProdutoCliente daoproduto = new DaoProdutoCliente();
    private String conteudoPreco;
    private String conteudoNome;
    private String conteudoQtd;
    FXMLCarrinhoController carrinho;
    Parent parentTela;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            criarCategoriaPizza();
        } catch (IOException ex) {
            Logger.getLogger(FXMLPizzasController.class.getName()).log(Level.SEVERE, null, ex);
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

    public void criarCategoriaPizza() throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("projetocardapioeletronico2/FXMLCarrinho.fxml"));

        Parent tela = loader.load();
        FXMLCarrinhoController controllerCarrinho = loader.getController();

        this.carrinho = controllerCarrinho;
        this.parentTela = tela;

        String categoria = "Pizzas";

        for (Produto prd : daoproduto.getbuscarProdutosBD()) {

            if (prd.getCategoria().equalsIgnoreCase(categoria)) {
                try {
                    FXMLLoader fxmll = new FXMLLoader(getClass().getResource("FXMLTelinhaProdutos.fxml"));
                    Parent telinhaProduto = (Parent) fxmll.load();
                    panePizza.getChildren().add(telinhaProduto);

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
