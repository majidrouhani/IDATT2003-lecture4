package edu.ntnu.idatt2003.lectures.abstraction.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.ntnu.idatt2003.lectures.abstraction.shape.triangle.EquilateralTriangle;
import edu.ntnu.idatt2003.lectures.abstraction.shape.triangle.IsoscelesTriangle;
import edu.ntnu.idatt2003.lectures.abstraction.shape.triangle.RightTriangle;
import edu.ntnu.idatt2003.lectures.abstraction.shape.triangle.Triangle;

/**
 * @author rouhani
 *
 */
public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  /**
   * @param args
   */
  public static void main(String[] args) {

    List<Shape> shapes = new ArrayList<>();

    shapes.add(new Sqaure(5.2, 3.5));
    shapes.add(new Circle(2.1));
    shapes.add(new Triangle(5, 1, 3));
    shapes.add(new EquilateralTriangle(5));
    shapes.add(new RightTriangle(5, 3));
    shapes.add(new IsoscelesTriangle(5, 4));


    for (Shape shape : shapes) {
      String msg = "Areal av " + shape.getClass().getSimpleName() + " er " + String.format("%.2f", shape.calcArea());

      log.log(Level.INFO, "{0}", msg);
    }
  }
}
