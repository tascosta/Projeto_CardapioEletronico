package projetocardapioeletronico2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import projetocardapioeletronico2.classes.MeuCaarrinho;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLTelinhaItensController implements Initializable {

    FXMLLoader carrinho = new FXMLLoader(getClass().getResource("FXMLCarrinho.fxml"));
    FXMLCarrinhoController carrinhoCompras = new FXMLCarrinhoController();

    @FXML
    private Label lblnome;
    @FXML
    private Label lblPreco;
    @FXML
    private Label lblQuantidade;
    @FXML
    private Button btnmais;
    @FXML
    private Button btnmenos;
    @FXML
    private Label lblTotalItem;

    int cont;
    double totalItem;
    double precoatual;
    double valorTotalItem;
    double totalPedido;
    double acumulador;

    MeuCaarrinho meuCar = new MeuCaarrinho();

    public void carregarConteudo(String nome, String precoAtual, String quantidade, double precoItem, double totalPedido) {
        this.lblnome.setText(nome);
        this.lblPreco.setText(precoAtual);
        this.lblQuantidade.setText(quantidade);
        this.totalItem = precoItem;
        lblTotalItem.setText(Double.toString(totalItem));
        this.precoatual = Double.parseDouble(precoAtual);
        cont = Integer.parseInt(quantidade);
        this.totalPedido = totalPedido;

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void btnmais(ActionEvent event) {

        if (cont < 100) {
            cont++;
            lblQuantidade.setText(Integer.toString(cont));
            somarItem();

        }
    }

    @FXML
    private void btnmenos(ActionEvent event) {

        if (cont > 0) {
            cont--;
            lblQuantidade.setText(Integer.toString(cont));
            subtrairItem();
        }
    }
    @FXML
    public void subtrairItem() {

        totalItem = totalItem - precoatual;
        lblTotalItem.setText(Double.toString(totalItem));
        carrinhoCompras.SetSubtrairTotal(totalItem);
     
    }
    @FXML
    public void somarItem() {

        totalItem = totalItem + precoatual;
        double totalcompra = 0;
        double totalCompra = totalcompra + totalItem;
        lblTotalItem.setText(Double.toString(totalItem));
        carrinhoCompras.SetTotal(totalCompra);
        
    }


}
