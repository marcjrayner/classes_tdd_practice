import java.util.ArrayList;

public class Bus {
    private String destination;
    private ArrayList<Person> passengers;
    private int capacity;

    public Bus(String destination) {
        this.capacity = 50;
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
    }


    public int countPassengers() {
        return this.passengers.size();
    }
}
