package ru.stqa.homework.sandbox;

public class MyFirstProgram {

  public static void main(String[] args){

    Point d = new Point (0,1);
    System.out.println("Destination between " + d.p1 +" and " + d.p2 + " = " + area(d));
  }
  public static double area(Point d) {
    return Math.sqrt((d.p2 )*(d.p2)-(d.p1)*(d.p1));
  }

}