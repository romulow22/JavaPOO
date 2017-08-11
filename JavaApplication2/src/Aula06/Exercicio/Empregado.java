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
public class Empregado {
    String nome;
    float salario;
    int ano;
    
    Empregado (String n, float s, int a){
        nome = n;
        salario = s;
        ano = a;
    }
    
    String getNome(){
        return nome;
    }
    
    float getSalario(){
        return salario;
    }
    
    int getAno(){
        return ano;
    }
    
    void aumentaSalario(float t){
        salario *= (1 + t);
    }

    @Override
    public String toString(){
        return "Empregado";
    }
    
    void imprime(){
        System.out.println(this+":"+nome+" "+ano+" "+salario+".");
    }
}
