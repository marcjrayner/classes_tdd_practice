import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Portobello");
        person = new Person();
        busStop = new BusStop("Murrayfield");
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

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canPickUpPassenger() {
        busStop.addPerson(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.countPassengers());
        assertEquals(0, busStop.queueCount());
    }



}
