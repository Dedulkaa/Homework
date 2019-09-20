package ru.stqa.homework.sandbox;

import static java.lang.Math.sqrt;

public class Point {
  public double p1;
  public double p2;

  public Point(double p1, double p2){
    this.p1 = p1;
    this.p2 = p2;
  }
  public double area() {
    return sqrt((this.p1)*(this.p2)-(this.p1)*(this.p1));
  }
}