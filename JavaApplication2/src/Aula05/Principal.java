/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

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
}


class Pixel extends Point {
  int color;
  Pixel (int x, int y, int c) {
    super(x, y);
    color = c;
  }
}


class Principal {
  public static void main(String[] args) {
    Point p1 = new Point();       //  p1 está em (0, 0)
    Point p2 = new Point(1, 2);   //  p2 está em (1, 2)

    /******************************************************
     * Quanto sobrecarregamos um metodo, devemos manter a mesma semântica:
     * versões devem ter a mesma função.
     * Exemplo abaixo:
     ******************************************************/
    int a = Math.abs(-10);        //  a = 10;
    double b = Math.abs(-2.3f);    //  b = 2.3;
   
  }
}
