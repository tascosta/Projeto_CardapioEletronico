package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import projetocardapioeletronico2.classes.Feedback;

/**
 *
 * @author TSC
 */
public class DaoFeedbackCliente {

    private int atendimento;
    private int produtos;
    private int servicos;
    private int ambiente;
    private int cardapioEletronico;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sqlComando;

    public void inserirBd(int atendimento, int produtos, int servicos, int ambiente, int cardapioEletronico) {
        this.atendimento = atendimento;
        this.produtos = produtos;
        this.servicos = servicos;
        this.ambiente = ambiente;
        this.cardapioEletronico = cardapioEletronico;
        DbConnectionSQLServerCliente connectionSQLServer = new DbConnectionSQLServerCliente();
        conn = connectionSQLServer.getConnection();

        try {
            sqlComando = "insert into Feedback (Atendimento,Produtos,Servicos,Ambiente,CardapioEletronico) values (?,?,?,?,?)";

            ps = conn.prepareStatement(sqlComando);
            ps.setInt(1, this.atendimento);
            ps.setInt(2, this.produtos);
            ps.setInt(3, this.servicos);
            ps.setInt(4, this.ambiente);
            ps.setInt(5, this.cardapioEletronico);
            ps.executeUpdate();
            System.out.println("INSERIDO COM SUCESSO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("DEU ERRO NO INSERT");
        }
    }

    
}
