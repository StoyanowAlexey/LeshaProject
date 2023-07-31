package LB3.interfaces;

public interface Bus extends Vehicle {
    void Bus(int max_people, int people, double max_petrol, double petrol);

    int getPeopleMax();

    int getPeople();

}
