package edu.ntnu.idatt2003.lectures.finalexamples.method;

/**
 * Patient.
 *
 * @author "Majid Rouhani"
 *
 */
public class Patient extends Person {
  private Person gp;

  protected Patient(String socialSecurityNumber, String firstName, String middleName,
      String surname, Person gp) {
    super(socialSecurityNumber, firstName, middleName, surname);

    this.gp = gp;
  }

  public Person getGp() {
    return gp;
  }

  public void setGp(Person gp) {
    this.gp = gp;
  }

  @Override
  public String toString() {
    return "Patient [gp=" + gp + "]";
  }

}
