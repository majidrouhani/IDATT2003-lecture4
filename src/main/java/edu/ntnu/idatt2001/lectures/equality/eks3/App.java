package edu.ntnu.idatt2001.lectures.equality.eks3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger logger = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    Person p1 = new Person("Ola Normann");
    Person p2 = new Person("Ola Normann");
    Person p3 = p1;

    String result = p1 == p2 ? "P1 er lik p2" : "P1 er ikke lik p2";
    logger.log(Level.INFO, "{0}", result);

    result = p1.equals(p2) ? "P1 er lik p2" : "P1 er ikke lik p2";
    logger.log(Level.INFO, "{0}", result);

    result = p1 == p3 ? "P1 er lik p3" : "P1 er ikke lik p3";
    logger.log(Level.INFO, "{0}", result);

    result = p1.equals(p3) ? "P1 er lik p3" : "P1 er ikke lik p3";
    logger.log(Level.INFO, "{0}", result);

    logger.log(Level.INFO, "p1.hashCode() = {0}", p1.hashCode());
    logger.log(Level.INFO, "p2.hashCode() = {0}", p2.hashCode());
    logger.log(Level.INFO, "p3.hashCode() = {0}", p3.hashCode());
  }

}
