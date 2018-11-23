import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Harry", "Potter");
    }

    @Test
    public void hasFirstName() {
        assertEquals("Harry", passenger.getFirstName());
    }

    @Test
    public void hasLastName() {
        assertEquals("Potter", passenger.getLastName());
    }

}
