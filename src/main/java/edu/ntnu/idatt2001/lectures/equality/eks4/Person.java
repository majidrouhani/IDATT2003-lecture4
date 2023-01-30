package edu.ntnu.idatt2001.lectures.equality.eks4;

import java.time.LocalDate;

public class Person {
  public static int equalsInvocations = 0;

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
    return 1;
  }

  @Override
  public boolean equals(Object obj) {
    equalsInvocations++;

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
