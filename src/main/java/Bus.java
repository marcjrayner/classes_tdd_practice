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

    public void addPassenger(Person person) {
        if (this.countPassengers() < capacity) {
            this.passengers.add(person);
        }
    }

    public Person removePassenger() {
       return this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop) {
        Person newPassenger = busStop.removePerson();
        this.passengers.add(newPassenger);
    }
}
