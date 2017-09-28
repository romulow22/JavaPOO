/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

package Aula09;

import java.util.*;


public class Collection {
    private static final String[] colors = {"vermelho", "preto", "branco", "amarelo"};

    public Collection() {
        List<String> list = new ArrayList<String>();
        for (String color: colors) {
            list.add(color);
        }
        this.imprimeLista(list);
    }

    private void imprimeLista(Collection<String> c) {
        Iterator<String> it = c.iterator();
        System.out.println("Conteúdo da lista:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        new Collection();
    }
}
