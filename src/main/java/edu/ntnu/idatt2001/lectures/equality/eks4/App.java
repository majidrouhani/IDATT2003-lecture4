package edu.ntnu.idatt2001.lectures.equality.eks4;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger logger = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    Person p1 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));
    Person p2 = new Person("Hans Jakobsen", LocalDate.of(1991, 10, 20));

    String result = p1 == p2 ? "P1 er lik p2" : "P1 er ikke lik p2";
    logger.log(Level.INFO, "{0}", result);

    result = p1.equals(p2) ? "P1 er lik p2" : "P1 er ikke lik p2";
    logger.log(Level.INFO, "{0}", result);

    logger.log(Level.INFO, "p1.hashCode() = {0}", p1.hashCode());
    logger.log(Level.INFO, "p2.hashCode() = {0}", p2.hashCode());

    p1.setFullname("Hans Jakob");
    logger.log(Level.INFO, "Name = {0}", p1.getFullname());
    logger.log(Level.INFO, "p1.hashCode() = {0}", p1.hashCode());
  }
}
