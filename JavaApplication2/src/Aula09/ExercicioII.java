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
public class ExercicioII {
    private static final String[] colors = {"vermelho", "preto", "branco", "amarelo"};

    public ExercicioII() {
        Set<String> set = new TreeSet<String>();
        Arrays.sort(colors);
        for (String color: colors) {
            set.add(color);
        }
        set.add("branco");
        set.add("preto");
        this.imprimeLista(set);
    }

    private void imprimeLista(Collection<String> c) {
        Iterator<String> it = c.iterator();
        System.out.println("Conteúdo da lista:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        new ExercicioII();
    }
}