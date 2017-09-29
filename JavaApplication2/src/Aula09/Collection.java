/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aula09;

import java.util.*;

//Coleções são estruturadas em 3 camadas:
// Interfaces (List, Arrays, Collection, Set, Map)
// Classes abstratas (AbstractList, AbstractSet, AbstractMap)
// Classes de implementação (Arraylist,LinkedList,ArrayList,TreeSet,HashSet,TreeMap,HashMap)

//Definição de Coleção

//Collection<E>
//é a interface raiz das coleções
//define metodos mais gerais como size(), clear() e isEmpty().
//é estendida pelas interfaces List, Set e Map

//List<E>
// organiza os elementos numa coleção sequencialmente
// possui metodos de inserção e remoção sequencial de elementos
// classes LinkedList (encadeadas) e Arraylist (acesso por indice e 
// possibilidade de crescimento a implementam
//
//Set<E>
// permite o agrupamento de obj sem duplicatas
// SortedSet<E> estende permitindo iteração ordenada
//
//Map<K,V>
// usa obj para indexar elementos armazenados
// formato de um conj de pares (chave,valor)
// útil em situações onde a utilização de indices é pouco adequada
// chaves são unicas

// Manipulação
//
//Iterator<E>
//interface raiz dos iteradores (classes utilizadas para percorrer as coleções)
//define metodos gerais como next()
//pode ser obtido atraves do metodo iterator() de uma classe Collection<E>

//ListIterator<E>
//estende a interface Iterator
//além dos metodos herdados, define metodos para percorrer uma coleção no sentido inverso
//classes que implementam List, permitem seu uso
//pode ser obtido atraves do metodo listiterator() das classes que o implementam

//Arrays
//fornecem metodos static para manipulação de arrays
//estes metodos realizam operações sobre arrays, como: ordenação, busca binaria,
//comparação e preenchimento (ex: sort)

//Collections
//Classe analoga a Arrays para coleções em geral
//metodos (sort, binarySearch, reverse, shuffle, min/max, frequency)


//Collection (Interfaces)-> List, Set (SortedSet), Map (Sorted Map)
//Classes de implementacao:
// List: LinkedList, Vector (Stack), ArrayList,
// Set: TreeSet, HashSet, LinkedHashSet
// Map: TreeMap, HashMap, LinkedHashMap, IdentityHashMap
public class Collection {
    private static final String[] colors = {"vermelho", "preto", "branco", "amarelo"};

    public Collection() {
        List<String> list = new ArrayList<String>();
        for (String color: colors) { // for (int i=0/ i<colors.length;i++)
            list.add(color);         //     list.add(colors[i]);
        }
        this.imprimeLista(list);
    }

    private void imprimeLista(Collection<String> c) { //
        Iterator<String> it = c.iterator(); //para obter o iterador da coleção
        System.out.println("Conteúdo da lista:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        new Collection();
    }
}
