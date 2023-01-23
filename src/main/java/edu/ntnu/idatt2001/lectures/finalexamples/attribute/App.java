package edu.ntnu.idatt2001.lectures.finalexamples.attribute;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Client.
 *
 * @author "Majid Rouhani"
 *
 */
public class App {

	private static final Logger logger = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    Person person = new Person("31126120041", "Odd", "Even", "Primtallet");

    // Kan ikke definere og kalle denne:
    // person.setSocialSecurityNumber()

    logger.log(Level.INFO,"Student ID: {0}",person);
  }
}
