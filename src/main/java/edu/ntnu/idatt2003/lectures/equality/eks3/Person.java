package edu.ntnu.idatt2003.lectures.equality.eks3;

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
    result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (fullname == null) {
      if (other.fullname != null)
        return false;
    } else if (!fullname.equals(other.fullname))
      return false;
    if (birthDate == null) {
      if (other.birthDate != null)
        return false;
    } else if (!birthDate.equals(other.birthDate))
      return false;
    return true;
  }  
}
