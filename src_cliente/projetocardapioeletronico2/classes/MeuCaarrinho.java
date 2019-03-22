/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico2.classes;

/**
 *
 * @author TSC
 */
public class MeuCaarrinho {

    private double novoTotal = 0;

    //Guardar Valor
    public double guardarValor(double Total) {
        this.novoTotal = this.novoTotal + Total;
        return novoTotal;

    }

}
