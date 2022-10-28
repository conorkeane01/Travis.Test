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
    void test_Title() {
        Passenger myPass = new Passenger("Mr", "Conor", 12345678910L, 879543461L, 21);
        assertEquals("Mr", myPass.getTitle());
    }

    @AfterEach
    void tearDown() {
    }
}