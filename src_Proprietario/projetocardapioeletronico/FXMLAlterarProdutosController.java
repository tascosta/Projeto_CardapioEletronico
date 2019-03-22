/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author isabe
 */
public class FXMLAlterarProdutosController implements Initializable {
    
    String foto;
    
    @FXML
    ImageView picFoto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    private void btnBuscar(ActionEvent event) throws IOException {
       //Abir pasta de arquivos 
        Window stage = null;
       
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Escolher imagem");
        this.foto = fileChooser.showOpenDialog(stage).toString();
        
         Image image = new Image(new FileInputStream(foto));
         picFoto.setImage(image);
        
    }
    
}
