/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Compra {
    CompraModel compra;
    Calculo desc;
    
    public void RealizarCompra(){
        compra = new CompraModel();
        
        Scanner dados = new Scanner (System.in);
        System.out.println("Informe o valor da compra: ");
        compra.setValor(dados.nextInt());
        
        System.out.println("Informe a idade: ");
        compra.setIdade(dados.nextInt());
        
        desc= new Calculo();
        compra.setDesconto(desc.calcularDesconto(compra.getValor(), compra.getIdade()));
        compra.setTotal(desc.calcularTotal(compra.getValor(), compra.getDesconto()));
        
        System.out.println("Valor do desconto: "+ compra.getDesconto());
        System.out.println("Valor a pagar: "+ compra.getTotal());
        System.out.println("teste de commit1");
                
                
        
    }
}
