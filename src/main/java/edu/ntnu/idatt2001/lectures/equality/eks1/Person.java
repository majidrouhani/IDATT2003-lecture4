package edu.ntnu.idatt2001.lectures.equality.eks1;

import java.time.LocalDate;

public class Person {
  private String fullname;
  private LocalDate birthDate;

  public Person(String name, LocalDate birthDate) {
    this.setFullname(name);
    this.setBirthDate(birthDate);
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }
}
