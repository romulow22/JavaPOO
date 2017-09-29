/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;
import javax.swing.*; //importa todas as classes
//As classes do pacote java.lang não precisão ser importadas
public class Import {
    
    //classe math é constante
    int a = java.lang.Math.abs(-10); // a=10;
    
}
//private = só pode ser acessado pela propria classe
//protected = sáo acessados pelas subclasses e pelas classes do pacote
//sem modificador = são acessados pelas classes do pacote
class Stack {        // Stack é exportada
    private int[] data;
    private int top_index;
    public Stack(int size) {
        data = new int[size];
        top_index = -1;
    }

    public boolean isEmpty() {
        return (top_index < 0);
    }

    public void push(int n) {
        data[++top_index] = n;
    }

    public int pop() {
        return data[top_index--];
    }

    public int top() {
        return data[top_index];
    }

}

