package edu.ntnu.idatt2003.lectures.finalexamples.finalclass1;

/**
 * Client.
 *
 * @author "Majid Rouhani"
 *
 */
public class App {

  public static void main(String[] args) {
    Vehicle.move(new Car());
    Vehicle.move(new Aeroplane());
  }
}
