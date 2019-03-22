/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocardapioeletronico2.classes;

/**
 *
 * @author isabe
 */
public class Pedido {
    
         private double Total;
       

        public double CalcularPreçoItem(double precoAtual,int Quant)
        {
        double resultaPrecoItem = precoAtual* Quant;

        return resultaPrecoItem;           
         }

        public double CalcularTotalPedido(double total)
        {
            Total = Total + total;
            return Total;
        }
    
}
