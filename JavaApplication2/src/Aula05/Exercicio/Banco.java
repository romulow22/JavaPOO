/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05.Exercicio;

/**
 *
 * @author romulo
 */
public class Banco {
    static int prox_banco = 1;
    final int MAX_CONTAS = 10;
    String nome;
    int codigo, prox_conta, ind_array;
    Conta[] contas;
    
    Banco(String n){
        nome = n;
        codigo = prox_banco++;
        prox_conta = 1;
        contas = new Conta[this.MAX_CONTAS];
        ind_array = 0;
    }
    
    int getCodigo() {return this.codigo;}
    String getNome(){return this.nome;}
    
    Conta criaConta(String nome){
        Conta c;
        if(this.ind_array == MAX_CONTAS)
            c = null;
        else{
            c = new Conta(nome, prox_conta++, this);
            this.contas[this.ind_array++] = c;
        }
        return c;
    }
    Conta buscaConta(int c){
    int i;
    for (i=0; i<this.ind_array;i++){
        if (contas[i].getCodigo()==c)
            return this.contas[i];
    }
    return null;
    }
    
    Poupanca criaPoupanca(String nome) {
        Poupanca poupanca;
        if (this.ind_array == MAX_CONTAS) {
            poupanca = null;
        } else {
            poupanca = new Poupanca(nome, prox_conta++, this);
            this.contas[this.ind_array++] = poupanca;
        }
    return poupanca;
  }

    
}
