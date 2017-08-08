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
class Poupanca extends Conta {

    Poupanca(String n, int c, Banco b) {
        super(n,c,b);
    }
    
    @Override
    public void retira(float soma) {
        if (this.getSaldo() - soma < 0) {
            System.out.println("A poupança não pode ter saldo negativo.");
        } else {
            this.setSaldo(this.getSaldo() - soma);
        }
    }

    @Override
    public String toString() {
        return "Poupança";
    }
}
