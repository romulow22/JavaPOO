/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;
import java.util.LinkedList;

//Estruturas de dados como Pilhas, Filas 
//existem independentemente do tipo armazenado.
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.addFirst("primeiro");
        l.addFirst("segundo");
        System.out.println(l);
        
    }
}