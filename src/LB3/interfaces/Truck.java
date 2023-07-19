package LB3.interfaces;

public interface Truck extends  Vehicle{
    void Truck(double load, double max_load, double petrol, double max_petrol);

    double getCurrentLoad();

    double getMaxLoad();

}
