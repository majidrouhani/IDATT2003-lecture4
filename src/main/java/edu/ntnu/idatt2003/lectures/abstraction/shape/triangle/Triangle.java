package edu.ntnu.idatt2003.lectures.abstraction.shape.triangle;

import edu.ntnu.idatt2003.lectures.abstraction.shape.Shape;

/**
 * Triangle.
 *
 * @author "Majid Rouhani"
 *
 */
public class Triangle extends Shape {
  protected final double side1;
  protected final double side2;
  protected final double side3;

  /**
   * Triangle constructor.
   *
   * @param side1 - length of side 1
   * @param side2 - length of side 2
   * @param side3 - length of side 3
   */
  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  @Override
  public double calcCircumference() {
    return this.side1 + this.side2 + this.side3;
  }

  @Override
  public double calcArea() {
    double l1 = 4*Math.pow(side1, 2)*Math.pow(side2, 2);
    double l2 = Math.pow(Math.pow(side1, 2)+Math.pow(side2, 2)-Math.pow(side3, 2),2);
    return Math.sqrt(l1-l2)/4;
    
  }

  @Override
  public String toString() {
    return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
  }
}
