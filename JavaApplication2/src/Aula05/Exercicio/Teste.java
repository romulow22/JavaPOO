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
public class Teste {

    public static void main(String[] args) {
        
        Banco itau = new Banco("Itau");
        System.out.println(itau.getCodigo());
        System.out.println(itau.getNome());

        Conta maria = itau.criaConta("Maria");
        System.out.println(maria);

        Conta b = itau.buscaConta(1);
        b = itau.buscaConta(2);

        Poupanca jose = itau.criaPoupanca("Jose");
        System.out.println(jose + " " + jose.getNome());
        System.out.println(jose + " " + jose.getCodigo());
        System.out.println(jose + " " + jose.getSaldo());

        jose.aplica(100.0f);
        System.out.println(jose + " " + jose.getSaldo());

        jose.retira(150.0f);
        System.out.println(jose + " " + jose.getSaldo());

        jose.retira(30.5f);
        System.out.println(jose + " " + jose.getSaldo());
    }
}
