package edu.ntnu.idatt2003.lectures.abstraction.shape;

/**
 * @author rouhani
 *
 */
public class Sqaure extends Shape {
  private final double height;
  private final double width;

  /**
   * @param hoyde
   * @param bredde
   */
  public Sqaure(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double getHeight() {
    return this.height;
  }

  public double getWidth() {
    return this.width;
  }

  /** Calculate area.
   *
   *  {@inheritDoc}
   */
  @Override
  public double calcArea() {
    return this.height * this.width;
  }

  @Override
  public double calcCircumference() {
    return (this.height+this.width)*2;
  }

}
