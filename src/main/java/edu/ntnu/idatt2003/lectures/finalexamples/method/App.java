package edu.ntnu.idatt2003.lectures.finalexamples.method;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Client for testing final method.
 *
 * @author "Majid Rouhani"
 *
 */
public class App {

  private static final Logger logger = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    ArrayList<Person> persons = new ArrayList<Person>();

    persons.add(new Employee("31126018440", "Odd", "Even", "Primtallet", 45000));
    persons.add(new Manager("01126228500", "Hans", "Jakob", "Hansen", 550000, "AIT"));

    Person gp = new Person("15018028621", "Dr. Ingrid", "", "Andersen");

    persons.add(new Patient("01126228112", "Hanne", "", "Johansen", gp));

    for (Person person : persons) {
      if (!(person instanceof Patient)) {
        Employee employee = (Employee) person;
        employee.setSalary(employee.getSalary() * 1.05);
      }
    }

    logger.log(Level.INFO,"Student ID: {0}",persons);

  }
}
