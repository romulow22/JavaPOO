/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07;
// -> interface declara um conjunto de atributos e métodos vazios.
// -> esses atributos são constantes (static) e os metodos publicos.
// -> quando uma classe implementa uma interface, esta classe precisa
// definir a implementação de todos os metodos vazios.
interface A {

}

interface B extends A {
    int y = 10; // é constante
}

class C {
    static int y = 20; // é constante
}

public class D extends C implements B {
    public static void main(String[] args) {
        System.out.println("A soma das constantes é:");
        System.out.println(B.y + C.y);
    }
}

