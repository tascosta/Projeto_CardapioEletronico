
package projetocardapioeletronico.classes;
import dao.DaoFeedback;

/**
 *
 * @author isabe
 */
public class Feedback {
    
    private int atendimento;
    private int produtos;
    private int servicos;
    private int ambiente;
    private int cardapioEletronico;
    
    public Feedback(int atendimento,int produtos,int servicos,int ambiente,int cardapioEletronico){   
    this.atendimento=atendimento;
    this.produtos=produtos;
    this.servicos=servicos;
    this.ambiente=ambiente;
    this.cardapioEletronico=cardapioEletronico;
    }
    
    

    /**
     * @return the atendimento
     */
    public int getAtendimento() {
        return atendimento;
    }

    /**
     * @param atendimento the atendimento to set
     */
    public void setAtendimento(int atendimento) {
        this.atendimento = atendimento;
    }

    /**
     * @return the produtos
     */
    public int getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the servicos
     */
    public int getServicos() {
        return servicos;
    }

    /**
     * @param servicos the servicos to set
     */
    public void setServicos(int servicos) {
        this.servicos = servicos;
    }

    /**
     * @return the ambiente
     */
    public int getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * @return the cardapioEletronico
     */
    public int getCardapioEletronico() {
        return cardapioEletronico;
    }

    /**
     * @param cardapioEletronico the cardapioEletronico to set
     */
    public void setCardapioEletronico(int cardapioEletronico) {
        this.cardapioEletronico = cardapioEletronico;
    }

}
