/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;

/**
 *
 * @author romulo
 */

public class ClienteCC {
    
    String nome; int conta; float saldo; 
    static float taxa_CPMF = 0.01F;
    float especial;
    
    ClienteCC(String pNome, int pConta, int pSaldo) {
        this.nome = pNome;
        this.conta = pConta;
        this.saldo = pSaldo;
    }
    
    ClienteCC(String pNome, int pConta){
        this(pNome,pConta,200);
    }
  
    ClienteCC(){
    
        this.nome = "Anonimo";
        this.conta = 0000;
        this.saldo = 200;
    }
    
    void RealizaSaque (float valor) {
        if (valor > especial + saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
    
    float RequisitaSaldo(){
        return saldo + especial;
    }   
}
