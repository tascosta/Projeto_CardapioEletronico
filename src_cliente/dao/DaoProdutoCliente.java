package dao;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.Image;

import projetocardapioeletronico2.classes.Produto;

/**
 *
 * @author TSC
 */
public class DaoProdutoCliente {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sqlComando;
    DbConnectionSQLServerCliente connectionSQLServer = new DbConnectionSQLServerCliente();

    private String Nome;
    private String Descricao;
    private Double Preco;
    private String Categoria;
    private String Tamanho;
    private String Tipo;
    private int codADM;
    private Blob imagem;
    private Image img;

    private List<Produto> produto = new ArrayList();

    //buscar um set de registros
    public List<Produto> getbuscarProdutosBD() {

        conn = connectionSQLServer.getConnection();
        try {
            sqlComando = "select *  FROM Produto";
            PreparedStatement consulta = conn.prepareStatement(sqlComando);
            ResultSet resultados = consulta.executeQuery();

            while (resultados.next()) {

                Nome = resultados.getString("Nome");
                Descricao = resultados.getString("Descricao");
                Preco = resultados.getDouble("PrecoAtual");
                Categoria = resultados.getString("Categoria");
                Tamanho = resultados.getString("Tamanho");
                Tipo = resultados.getString("Tipo");
                
                InputStream inputStream = resultados.getBinaryStream("Imagem");

                if (inputStream != null) {
                    img = new Image(inputStream);
                }

                Produto pro = new Produto(Nome, Descricao, Preco, Categoria, Tamanho, Tipo, img);
                this.produto.add(pro);
                System.out.println("CONSULTA REALIZADO COM SUCESSO");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("DEU ERRO NA CONSULTA");
        }
        return produto;

    }
}
