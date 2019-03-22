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
import javafx.scene.layout.Pane;
import projetocardapioeletronico2.classes.MeuCaarrinho;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLCarrinhoController implements Initializable {

    int a = 0;
    private double acumulador;
    private double valorDividir;
    private double ValorPorPessoa;
    int cont = 0;
    String formadePagamento;
    int Quantidade;
    double preco;

    MeuCaarrinho meuCar = new MeuCaarrinho();

    
    @FXML
    Label lblAcumularTotal;
    
    Button btnMais;
   
    Button btnMenos;
 
    @FXML
    Pane paneCarrinho;
   
    @FXML
    private Button btnSair;
   
    @FXML
    private Button btnContinuar;
 
    @FXML
    private Button btnZerarPedido;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
  
    public void carregarItens(String nome, String preco, String qtd, double precoItem, double totalPedido) throws IOException {

        FXMLLoader fxmll = new FXMLLoader();
        fxmll.setLocation(getClass().getClassLoader().getResource("projetocardapioeletronico2/FXMLTelinhaItens.fxml"));

        Parent tela = fxmll.load();

        FXMLTelinhaItensController telinhaItens = fxmll.getController();

        telinhaItens.carregarConteudo(nome, preco, qtd, precoItem, totalPedido);

        paneCarrinho.getChildren().add(tela);

        tela.setTranslateX(10);
        tela.setTranslateY(a);
        a = a + 80;
    }

    ;
   
    @FXML
    private void btnContinuar(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.pagamento);
    }

  
    @FXML
    private void btnSair(ActionEvent event) throws IOException {
        ProjetoCardapioEletronico2.scene.setRoot(ProjetoCardapioEletronico2.principal);
    }

    // Metodo Set somar Valor total Pedido
    @FXML
    public void SetTotal(double Total) {

        acumulador = acumulador = Total;
       
        lblAcumularTotal.setText(Double.toString(acumulador));

    }

    //Metodo Set Subtrai Valor total pedido
     @FXML
    public void SetSubtrairTotal(double Total) {

        acumulador = acumulador - Total;
        lblAcumularTotal.setText(Double.toString(acumulador));

    }

}
