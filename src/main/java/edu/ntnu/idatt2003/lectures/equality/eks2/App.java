package edu.ntnu.idatt2003.lectures.equality.eks2;

import java.time.LocalDate;

public class App {

  public static void main(String[] args) {
    Person p1 = new Person("Ola Normann",  LocalDate.of(1990, 1, 10));
    Person p2 = new Person("Ola Normann",  LocalDate.of(1990, 1, 10));
    Person p3 = p1;

    String result = p1 == p2 ? "P1 er lik p2" : "P1 er ikke lik p2";
    System.out.println(result);

    result = p1.equals(p2) ? "P1 er lik p2" : "P1 er ikke lik p2";
    System.out.println(result);

    result = p1 == p3 ? "P1 er lik p3" : "P1 er ikke lik p3";
    System.out.println(result);

    result = p1.equals(p3) ? "P1 er lik p3" : "P1 er ikke lik p3";
    System.out.println(result);

    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());    
    System.out.println(p3.hashCode());    
  }

}
