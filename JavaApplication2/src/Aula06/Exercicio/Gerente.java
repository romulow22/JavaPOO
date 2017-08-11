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
public class Gerente extends Empregado{
    Secretaria secret;
    Empregado[] subord;

    public Gerente(String n, float s, int a, Secretaria sec, Empregado e1, Empregado e2){
        super(n, s, a);
        subord = new Empregado[2];
        secret = sec;
        subord[0] = e1;
        subord[1] = e2;
    }
    
    @Override
    public String toString(){
        return "Gerente";
    }
    
    void aumento(){
        secret.aumentaSalario(0.1F);
        int i ;
        for (i=0; i<2; i++){
            subord[i].aumentaSalario(0.15F);
        }
    }
}
