package edu.ntnu.idatt2001.lectures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import edu.ntnu.idatt2001.lectures.equality.eks4.Person;

/**
 * Unit test for simple App.
 */
public class AppTest4 {

    @Test
    public void createHashSetWithDuplicates() {
        Person p1 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));
        Person p2 = new Person("Hans Jakobsen", LocalDate.of(1991, 10, 20));
    
    
        Map<String, Person> persons = new HashMap<>();

       persons.put(p1.getFullname(), p1);
       persons.put(p2.getFullname(),p2);
       
       persons.get(p1.getFullname());

       assertTrue(Person.equalsInvocations > 0);
    }
}
