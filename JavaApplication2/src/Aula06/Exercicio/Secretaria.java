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
public class Secretaria extends Empregado {
    
    String[] contatos;
    int pos_livre = 0;
    
    public Secretaria(String n, float s, int a) {
        super(n, s, a);
        contatos = new String[5];
    }
    
    void setContato (String n){
        contatos[pos_livre++] = n;
        if (pos_livre == 5)
            pos_livre = 0;
    }
    
    @Override
    public String toString(){
        return "Secretaria";
    }
}
