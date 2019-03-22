/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico2.classes;

import dao.DaoProdutoCliente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import projetocardapioeletronico2.FXMLPrincipalController;

/**
 *
 * @author isabe
 */
public class ThreadPromocao extends Thread{
    
    FXMLPrincipalController principal;
    private Image imagem;
    
    public ThreadPromocao(){
        
    }
    
    DaoProdutoCliente daoproduto = new DaoProdutoCliente();
    private List<Produto> listaProduto = new ArrayList();
    
    public void run() {
        
        int a=1;
        String tipo = "Promoção";
        listaProduto = daoproduto.getbuscarProdutosBD();
        
        while(a==1){
            for(Produto prd : listaProduto) {

           
                if (prd.getTipo().equalsIgnoreCase(tipo)){
                //imagem = prd.getImagem();
                //principal.minhaThread(imagem);
                System.out.println(prd.getImagem());
                    try {
                        Thread.sleep(2400);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadPromocao.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
        }
        }

}
}
