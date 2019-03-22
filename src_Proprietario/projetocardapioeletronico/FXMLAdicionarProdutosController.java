package projetocardapioeletronico;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import projetocardapioeletronico.classes.Produto;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLAdicionarProdutosController implements Initializable {

    ObservableList<String> CategoriaLst = FXCollections.observableArrayList("Bebidas", "Carnes", "Massas", "Pizzas", "Saladas", "Sobremesas");
    ObservableList<String> TipoLst = FXCollections.observableArrayList("Cardápio", "Promoção");
    ObservableList<String> TamanhoList = FXCollections.observableArrayList("Único", "Grande", "Média", "Pequeno");

    Produto produto;
    String caminho;
    
    @FXML
    ImageView picFoto;

    private Button btnAddProduto;
    @FXML
    private TextField jtxtfld_NomeProduto;
    @FXML
    private TextField jtxtfld_Preco;
    @FXML
    private ComboBox jcbx_Categoria;
    @FXML
    private ComboBox jcbx_Tipo;
    @FXML
    private ComboBox jcbx_Tamanho;
    @FXML
    private TextArea jtxtarea_Descricao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        jcbx_Categoria.setItems(CategoriaLst);
        jcbx_Tipo.setItems(TipoLst);
        jcbx_Tamanho.setItems(TamanhoList);
    }

    @FXML
    private void btnBuscar(ActionEvent event) throws IOException, Exception {
        //Abir pasta de arquivos 
        Window stage = null;

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Escolher imagem");
        caminho = fileChooser.showOpenDialog(stage).toString();
        System.out.println("caminho: " + caminho);
        Image image = new Image(new FileInputStream(caminho));
        picFoto.setImage(image);

    }

    @FXML
    private void btnAddProduto(ActionEvent event) throws IOException {

        String nome = jtxtfld_NomeProduto.getText();
        String descricao = jtxtarea_Descricao.getText();
        double precoUnitario = Double.parseDouble(jtxtfld_Preco.getText());
        String categoria = (String) jcbx_Categoria.getValue();
        String tamanho = (String) jcbx_Tamanho.getValue();
        String tipo = (String) jcbx_Tipo.getValue();

        produto = new Produto(nome, descricao, precoUnitario, categoria, tamanho, tipo, caminho);
        produto.inserirBD();
    }
}
