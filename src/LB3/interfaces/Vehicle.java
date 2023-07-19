package LB3.interfaces;

public interface Vehicle {

    void Vehicle(double tank_volume, double petrol_amount);

    double getTankVolume();

    double getPetrolAmount();

    void arrive();

    boolean leave();

    boolean isOnBase();

    //void Vehicle(int people, int max_people, double tank_volume, double petrol_amount);
}
