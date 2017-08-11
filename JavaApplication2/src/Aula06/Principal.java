/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;


/**
 *
 * @author romulo
 */
class Point {
  int x = 0;
  int y = 0;
  Point () {}

  Point (int x, int y) {
    this.x = x;
    this.y = y;
  }
  void move(int dx, int dy) {
    x += dx;
    y += dy;
  }
  void print(){
      System.out.println("Point ("+x+","+y+")");
  }
}


class Pixel extends Point {
  int color;
  Pixel (int x, int y, int c) {
    super(x, y);
    color = c;
  }
  
  @Override
  void print(){
      System.out.println("Pixel ("+x+","+y+","+color+")");
    }

}

class Principal {
  public static void main(String[] args) {
    
    // Pixel nao perde a compatibilidade com point pois todo pixel é um point
    Point[] pontos = new Point[5]; //vetor de pontos
    
    pontos[0] = new Point();
    pontos[1] = new Pixel(1,2,0); // pixel é um ponto
  
    // O contrario nao é verdade
    // Nem todo ponto é pixel
    
    //uma variavel ponto pode receber um pixel e continua como tipo ponto.
    Point pt = new Pixel(0,0,1); //Pixel é ponto
    // pt é tipo ponto porem tem um obejto pixel, para utiliza-lo precisamos converte-lo.
    Pixel px = (Pixel)pt; // pt contem um pixel
    pt = new Point();  // pt agora é um ponto
    px = (Pixel)pt; //nao funciona pq pt é um ponto
    pt = new Pixel(0,0,0);
    //px = pt; -> nao funciona pq pt nem sempre é um pixel
    //atribuicao direta nao funcionara pois apesar de pt conter um pixel ele é do tipo ponto
    //devera ser feita a conversao para pixel
    
    //permite verificar a classe real de um objeto
    //"se pt é instancia de pixel"
    if (pt instanceof Pixel){
      Pixel pr = (Pixel)pt;
    }
    
    //usando print()
    pt.print(); // Point (0,0)
    px.print(); // Pixel (0,0,0)
    
    //variavel constante
    
    final int MAX_TAM = 10;
    
  }
  
}
