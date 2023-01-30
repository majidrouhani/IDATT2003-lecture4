package edu.ntnu.idatt2001.lectures.equality.eks2;

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
    return true;
  }
}
