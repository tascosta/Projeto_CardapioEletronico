package projetocardapioeletronico2;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import projetocardapioeletronico2.classes.MeuCaarrinho;
import projetocardapioeletronico2.classes.Pedido;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLTelinhaProdutosController implements Initializable {
     FXMLTelinhaItensController telinhaItens;


    @FXML
    private Label lblDescricao;
    @FXML
    private Label lblNomeProduto;
    @FXML
    private Label lblPreco;
    @FXML
    private Label lblCifrao;
    @FXML
    private Button btnMais;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnAdicionar;
    @FXML
    private Label lblQtd;
    @FXML
    private Label lblClicarMais;
    @FXML
    private ImageView imageView;

    String conteudonome;
    String conteudopreco;
    String conteudoQtd;
    FXMLTelinhaProdutosController telaProdutosController;
    FXMLCarrinhoController carrinho;

    int cont = 0;
    int a = 0;
    double TotalItem;
    double totalPedido;
    double precoItem;
    int quantidade;
    Double preco;

    Pedido pedido = new Pedido();
    MeuCaarrinho meuCar = new MeuCaarrinho();
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        lblQtd.setText(Integer.toString(cont));
        this.telaProdutosController = this;

    }

    /**
     * *******************************************************
     */
    @FXML
    public void carregar(String nome, String conteudoPreco, String qtd, FXMLCarrinhoController carrinho) {
        this.conteudonome = nome;
        this.conteudopreco = conteudoPreco;
        this.conteudoQtd = qtd;
        this.carrinho = carrinho;
    }

    /**
     * *******************************************************
     */
    void setLabels(String nome, String descricao, double preco, Image imagem) {

        lblNomeProduto.setText(nome);
        lblDescricao.setText(descricao);
        lblPreco.setText(Double.toString(preco));
        imageView.setImage(imagem);
    }

    @FXML
    private void btnMais(ActionEvent event) {
        if (cont < 100) {
            cont++;
            lblQtd.setText(Integer.toString(cont));

        }
    }

    @FXML
    private void btnMenos(ActionEvent event) {
        if (cont > 0) {
            cont--;
            lblQtd.setText(Integer.toString(cont));
        }

    }
    // Calcular Total Item

    private void CalcularItem() {

        this.precoItem = pedido.CalcularPreçoItem(this.preco, this.quantidade);
        TotalItem = precoItem;
        totalPedido = totalPedido + precoItem;
    }

    // Calcular Total Pedio
    private void TotalPedido() {

        this.totalPedido = pedido.CalcularTotalPedido(this.TotalItem);
        carrinho.SetTotal(totalPedido);
        //meuCar.guardarValor(totalPedido);

    }

    @FXML
    private void btnAdicionar(ActionEvent event) throws IOException {
        quantidade = Integer.parseInt(lblQtd.getText());
        preco = Double.parseDouble(lblPreco.getText());

        if (quantidade > 0) {
            CalcularItem();
            TotalPedido();

            carrinho.carregarItens(lblNomeProduto.getText(), lblPreco.getText(), lblQtd.getText(), this.precoItem, this.totalPedido);
            cont = 0;
        }
    }

}
