/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06.Exercicio;

/**
 *
 * @author romulo
 */
public class Teste {
    public static void main (String[] args){
        Empregado[] lista = new Empregado[4];
        
        lista[0] = new Secretaria("Maria", 1000F, 2000);
        lista[1] = new Empregado("Jose", 500F, 1998);
        lista[2] = new Empregado("Joao", 700F, 2001);
        lista[3] = new Gerente("Victor", 5000F, 1999, (Secretaria) lista[0], lista[1], lista[2]);   
        for (int i = 0; i<4 ; i++)
            lista[i].imprime();
        ((Gerente)lista[3]).aumento();
        for (int i = 0; i<4 ; i++)
            lista[i].imprime();
    }
}
