/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;
import java.util.*;
/**
 *
 * @author romulo
 */
class MinhaLista<T> {
    private List<T> itens = new ArrayList<T>();
    void add (T item) {
        itens.add(item);
    }
    T primeiro() {
        return itens.get(0);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        MinhaLista<String> ml = new MinhaLista<String>();
        ml.add("primeiro");
        ml.add("segundo");
        System.out.println(ml.primeiro());
    }
}