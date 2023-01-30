package edu.ntnu.idatt2001.lectures.equality.eks1;

public class Person {
  private String fullname;

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Person(String name) {
    this.setFullname(name);
  }
}
