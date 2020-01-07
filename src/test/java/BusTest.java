import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("Portobello");
    }

    @Test
    public void passengersShouldStartEmpty() {
        assertEquals(0, bus.countPassengers());
    }



}
