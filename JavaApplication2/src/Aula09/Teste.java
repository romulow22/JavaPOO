
package Aula09;
import java.util.LinkedList;

//Coleções são estruturadas em 3 camadas:
// Interfaces (List)
// Classes abstratas (AbstractList)
// Classes de implementação (Arraylist)


public class Teste {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst("primeiro");
        l.addFirst("segundo");
        System.out.println(l);
    }
}