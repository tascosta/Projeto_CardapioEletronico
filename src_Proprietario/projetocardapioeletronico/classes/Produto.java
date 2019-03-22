package projetocardapioeletronico.classes;

import dao.DaoProduto;


/**
 *
 * @author isabe
 */
public class Produto {

    private String nome;
    private String descricao;
    private double precoUnitario;
    private String categoria;
    private String tamanho;
    private String tipo;   
    private String caminhoImg;
    private int codADM = 1;

    public Produto(String nome, String descricao, double precoUnitario, String categoria, String tamanho, String tipo, String caminhoImg) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.caminhoImg = caminhoImg;
    }
   
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the precoUnitario
     */
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * @param precoUnitario the precoUnitario to set
     */
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * @return the codADM
     */
    public int getCodADM() {
        return codADM;
    }

    /**
     * @param codADM the codADM to set
     */
    public void setCodADM(int codADM) {
        this.codADM = codADM;
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }
     
    public void inserirBD() {
        DaoProduto addprodutobd = new DaoProduto();
        addprodutobd.inserirBd(this);
    }

}

		


   
  

