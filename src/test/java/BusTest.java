import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Portobello");
        person = new Person();
    }

    @Test
    public void passengersShouldStartEmpty() {
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
    }

//    @Test
//    public void



}
