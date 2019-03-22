package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetocardapioeletronico.classes.Produto;

/**
 *
 * @author TSC
 */
public class DaoProduto {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sqlComando;
    DbConnectionSQLServer connectionSQLServer = new DbConnectionSQLServer();

    public void inserirBd(Produto produto) {

        conn = connectionSQLServer.getConnection();
        int len;
        File f;
        FileInputStream fis;
        try {
            System.out.println("caminho: " + produto.getCaminhoImg());
            f = new File(produto.getCaminhoImg());
            fis = new FileInputStream(f);
            len = (int) f.length();
            sqlComando = "insert into Produto(Nome,Descricao,PrecoAtual,Categoria,Tamanho,Tipo,Imagem,CodADM) values (?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sqlComando);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setDouble(3, produto.getPrecoUnitario());
            ps.setString(4, produto.getCategoria());
            ps.setString(5, produto.getTamanho());
            ps.setString(6, produto.getTipo());
            ps.setBinaryStream(7, fis, len);
            ps.setInt(8, produto.getCodADM());

            ps.executeUpdate();
            System.out.println("INSERIDO COM SUCESSO");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("DEU ERRO NO INSERT");
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //buscar um set de registros
    public void buscarBd() {
        try {
            sqlComando = "select *  FROM Feedback";
            PreparedStatement consulta = conn.prepareStatement(sqlComando);
            ResultSet resultados = consulta.executeQuery();

            while (resultados.next()) {
                System.out.print(resultados.getInt("CodFeedBack") + " - ");
                System.out.print(resultados.getInt("Ambiente") + " - ");
                System.out.print(resultados.getInt("Comida") + " - ");
                System.out.println(resultados.getInt("CardapioEletronico"));
            }

            System.out.println("CONSULTA REALIZADO COM SUCESSO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("DEU ERRO NA CONSULTA");
        }
    }

}
