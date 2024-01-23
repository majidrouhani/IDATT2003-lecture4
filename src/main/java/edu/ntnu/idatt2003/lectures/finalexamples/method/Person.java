package edu.ntnu.idatt2003.lectures.finalexamples.method;

/**
 * Person.
 *
 * @author "Majid Rouhani"
 *
 */
public class Person {
  private final String socialSecurityNumber;
  private String firstName;
  private final String middleName;
  public String surname;

  protected Person(String socialSecurityNumber, String firstName, String middleName,
      String surname) {
    super();
    this.socialSecurityNumber = socialSecurityNumber;
    this.firstName = firstName;
    this.middleName = middleName;
    this.surname = surname;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public String getMiddleName() {
    return middleName;
  }

  @Override
  public String toString() {
    return "Person [personnummer=" + socialSecurityNumber + ", fornavn=" + firstName
        + ", mellomnavn=" + middleName + ", etternavn=" + surname + "]";
  }
}
