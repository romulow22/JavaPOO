/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07;

interface IObjVisual {
    void desenho(); //vazio
}

// relação de herança entre interfaces
interface IObjVisualDinamico extends IObjVisual {
    void movimenta(float x, float y);
}

//particularidade de uma classe abstrata é permitir que alguns metodos não sejam
// definidos, apenas declarados, como numa interface.
// deve obrigatoriamente ser estendida
abstract class ObjVisual {
    float pos_x, pos_y;
    //aqui
    abstract void desenho();

    void movimenta(float x, float y) {
        this.pos_x = x;
        this.pos_y = y;
        this.desenho();
    }
  
}
//Java:
//uma classe estende zero ou outra classe
//uma classe implementa zero ou mais interfaces

//extende da classe abstrata e implementa uma interface
class Circulo extends ObjVisual implements IObjVisual {
    float raio;

    public void desenho() {
        //implementa o metodo da interface 
    }
}

//a classe que implementa uma interface que é extendida de outra interface deve 
// implementar todos os seus metodos
 class Retangulo implements IObjVisualDinamico {

    //interface mae
    public void desenho() {
    }
    //interface filho
    public void movimenta(float x, float y) {
    }
}
