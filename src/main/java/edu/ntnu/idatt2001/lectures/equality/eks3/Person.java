package edu.ntnu.idatt2001.lectures.equality.eks3;

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
    if (firstName == null) {
      if (other.firstName != null)
        return false;
    } else if (!firstName.equals(other.firstName))
      return false;
    if (surname == null) {
      if (other.surname != null)
        return false;
    } else if (!surname.equals(other.surname))
      return false;
    return true;
  }
}
