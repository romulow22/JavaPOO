/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

/**
 *
 * @author romulo
 */
public class Static {
 //O modificador static quer dizer que a variável pertence à classe, não ao objeto; 
 //Isso quer dizer que todas as instâncias de uma classe enxergam a mesma variável,
 //e se uma delas modificar o valor, isso vai refletir em todas as outras instâncias.
    static int prox_id = 0;
    int id;
    Static(){
        id = prox_id++;
    }
    public static void main (String[] args){
        //id é um contador da quantidade de objetos criados
        Static l = new Static();
        Static c = new Static();
        System.out.println("L id = " + l.id);
        System.out.println("C id = " + c.id);
    }
}
