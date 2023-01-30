package edu.ntnu.idatt2001.lectures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import edu.ntnu.idatt2001.lectures.equality.eks3.Person;

/**
 * Unit test for simple App.
 */
public class AppTest3 {

    @Test
    void defaultEquals() {
        Person p1 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));
        Person p2 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));

        assertEquals(p1, p2); 
    }

    @Test
    void defaultEqualsHashCode() {
        Person p1 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));
        Person p2 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));

        assertEquals(p1.hashCode(), p2.hashCode());         
    }

    @Test
    public void createHashSetWithDuplicates() {
        Person p1 = new Person("Ola Normann",  LocalDate.of(1990, 1, 10));
        Person p2 = new Person("Ola Normann",  LocalDate.of(1990, 1, 10));

    
       Set<Person> persons = new HashSet<>();
    
       assertEquals(p1, p2); //assertion passed
       //when
       persons.add(p1);
       persons.add(p2);
       //than
       assertTrue(persons.size() == 2); //assertion failed
    
    }
}
