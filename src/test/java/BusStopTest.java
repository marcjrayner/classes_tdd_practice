import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Leith");
        person = new Person();
    }

    @Test
    public void canAddPersonToQ() {
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    

}
