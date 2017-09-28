/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08.Exercicio.SistemaBancario;

public class Poupanca extends Conta {
    public Poupanca(String nome, int codigo, Banco banco) {
        super(nome, codigo, banco);
    }

    @Override
    public void retira(float valor) {
        if (super.getSaldo() - valor < 0) {
            System.out.println("A poupança não pode ter saldo negativo");
        } else {
            super.retira(valor);
        }
    }

    @Override
    public String toString() {
        return "Poupança";
    }
}