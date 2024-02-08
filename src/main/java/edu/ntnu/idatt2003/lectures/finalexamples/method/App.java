package edu.ntnu.idatt2003.lectures.finalexamples.method;

/**
 * Client for testing final method.
 *
 * @author "Majid Rouhani"
 *
 */
public class App {

  public static void main(String[] args) {

    Employee employee = new Employee("31126018440", "Odd", "Even", "Primtallet", 45000);
    Manager manager = new Manager("01126228500", "Hans", "Jakob", "Hansen", 550000, "AIT");

    Person gp = new Person("15018028621", "Dr. Ingrid", "", "Andersen");

    Patient patient = new Patient("01126228112", "Hanne", "", "Johansen", gp);

    employee.setSalary(50000);
    manager.setSalary(600000);
    patient.setGp(new Person("15018028621", "Dr. Ingrid", "", "Andersen"));
  
  
  }
}
