/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author andre
 */
public class Calculo {
    private int valorDesconto;
    private int valorTotal;
    
    public int calcularDesconto (int valor, int idade){
        if (idade > 65){
            valorDesconto = valor*10/100;
            
        }
            
        else{
            valorDesconto = valor*1/100;
        }
        return valorDesconto;
    }
    
    public int calcularTotal(int valor, int desconto){
        valorTotal = valor-desconto;
        return valorTotal;
    }
}
