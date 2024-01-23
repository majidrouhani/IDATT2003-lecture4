package edu.ntnu.idatt2003.lectures.finalexamples.method;

/**
 * Manager.
 *
 * @author "Majid Rouhani"
 *
 */
public class Manager extends Employee {
  private String groupResponsible;

  protected Manager(String socialSecurityNumber, String firstName, String middleName,
      String surname, double salary, String group) {
    super(socialSecurityNumber, firstName, middleName, surname, salary);
    this.groupResponsible = group;
  }

  public String getGroupResponsible() {
    return groupResponsible;
  }

  public void setGroupResponsible(String groupResponsible) {
    this.groupResponsible = groupResponsible;
  }

  @Override
  public String toString() {
    return "Dagligleder [" + super.toString() + ", gruppeAnsvarlig=" + groupResponsible + "]";
  }
}
