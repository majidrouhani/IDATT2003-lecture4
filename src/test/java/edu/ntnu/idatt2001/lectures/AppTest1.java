package edu.ntnu.idatt2001.lectures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import edu.ntnu.idatt2001.lectures.equality.eks1.Person;

/**
 * Unit test for simple App.
 */
public class AppTest1 {

    @Test
    void defaultEquals() {
        Person p1 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));
        Person p2 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));
        Person p3 = p1;

        assertEquals(p3, p1); 
        assertEquals(p1, p2); 
    }

    @Test
    void defaultEqualsHashCode() {
        Person p1 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));
        Person p2 = new Person("Ola Normann", LocalDate.of(1990, 1, 10));

        assertEquals(p1.hashCode(), p2.hashCode());         
    }
}
