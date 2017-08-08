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
public class Conta {

    String nome;
    int codigo;
    Banco banco;
    float saldo;
    
    Conta(String n, int i, Banco b) {
        nome =n;
        codigo = i;
        banco = b;
        saldo = 0F;
    }


    int getCodigo() {
        return this.codigo;
    }
    
    Banco getBanco(){
        return this.banco;
    }
    
    String getNome(){
        return this.nome;
    }
    
    float getSaldo(){
        return this.saldo;
    }
    
    void setSaldo(float valor) {
        this.saldo = valor;
    }
    
    void aplica(float soma){
        this.setSaldo(this.getSaldo() + soma);
    }
    
    void retira(float soma){
        this.setSaldo(this.getSaldo() - soma);
    }
    
    @Override
    public String toString(){
        return "Conta corrente";
        
    }
}
