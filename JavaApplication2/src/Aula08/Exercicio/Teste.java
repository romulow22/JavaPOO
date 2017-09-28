/*
 * To change this license header, choose License Headers in Projkayanna rachelect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08.Exercicio;

import Aula08.Exercicio.SistemaBancario.*;

class Teste {
    public static void main(String[] args) {
        Banco itau = new Banco("Itaú");
        System.out.println(itau.getCodigoBanco());
        System.out.println(itau.getNomeBanco());
        Conta maria = itau.criaConta("Maria");
        System.out.println(maria);
        Conta b = itau.getConta(1);
        b = itau.getConta(2);
        Poupanca jose = itau.criaPoupanca("José");
        System.out.println(jose + " " + jose.getNome());
        System.out.println(jose + " " + jose.getCodigo());
        System.out.println(jose + " " + jose.getSaldo());
        jose.aplica(100.0F);
        System.out.println(jose + " " + jose.getSaldo());
        jose.retira(150.0F);
        System.out.println(jose + " " + jose.getSaldo());
        jose.retira(30.5F);
        System.out.println(jose + " " + jose.getSaldo());
    }
}