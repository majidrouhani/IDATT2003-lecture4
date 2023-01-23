package edu.ntnu.idatt2001.lectures.finalexamples.method;

/**
 * Employee.
 *
 * @author "Majid Rouhani"
 *
 */
public class Employee extends Person {
  private double salary;

  protected Employee(String socialSecurityNumber, String firstName, String middleName,
      String surname, double salary) {
    super(socialSecurityNumber, firstName, middleName, surname);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public final void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Ansatt [" + super.toString() + ", salary=" + salary + "]";
  }
}
