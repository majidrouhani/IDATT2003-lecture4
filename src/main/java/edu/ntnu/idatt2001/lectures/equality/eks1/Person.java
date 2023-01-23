package edu.ntnu.idatt2001.lectures.equality.eks1;

public class Person {
  private final String fullname;
  private final String firstName;
  private final String surname;

  public String getName() {
    return fullname;
  }

  public Person(String name) {
    this.fullname = name;
    this.firstName = name.split(" ")[0];
    this.surname = name.split(" ")[1];

  }

  public Person(String firstName, String surname) {
    this.firstName = firstName;
    this.surname = surname;
    this.fullname = this.firstName + " " + this.surname;
  }
}
