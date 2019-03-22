package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TSC
 */
public class DaoFeedback {

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
        DbConnectionSQLServer connectionSQLServer = new DbConnectionSQLServer();
        conn = connectionSQLServer.getConnection();

        try {
            sqlComando = "insert into Feedback (Ambiente,Servicos,Comida,CardapioEletronico) values (?,?,?,?)";

            ps = conn.prepareStatement(sqlComando);
            ps.setInt(1, this.atendimento);
            ps.setInt(2, this.produtos);
            ps.setInt(3, this.servicos);
            ps.setInt(4, this.ambiente);
            ps.setInt(4, this.cardapioEletronico);
            ps.executeUpdate();
            System.out.println("INSERIDO COM SUCESSO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("DEU ERRO NO INSERT");
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
