package ie.atu.week6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPass;

    @BeforeEach
    void setUp() {
    }

    @Test
    void success_test_Title() {
        Passenger myPass = new Passenger("Mr", "Conor", 12345678910L, 879543461L, 21);
        assertEquals("Mr", myPass.getTitle());
    }


    @Test
    void test_fail_title_check() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger ("Miss","Conor",12345678910L,879543461L,21);});
        assertEquals("Please enter Mr, Mrs or Ms", exMessage.getMessage());

    }

    @Test
    void test_success_name_check() {
        Passenger myPass = new Passenger("Mr", "Conor", 12345678910L, 879543461L, 21);
        assertEquals("Conor", myPass.getName());
    }

    @Test
    void test_fail_name() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger ("Mr","Oj",12345678910L,879543461L,21);});
        assertEquals("Name must be greater than 3 characters long", exMessage.getMessage());
    }



    @AfterEach
    void tearDown() {
    }
}