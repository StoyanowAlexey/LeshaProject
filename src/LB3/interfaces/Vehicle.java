package LB3.interfaces;

public abstract class Vehicle {

    void Vehicle(double tank_volume, double petrol_amount) {

    }

    double getTankVolume() {
        return 0;
    }

    double getPetrolAmount(){
        return 0;
    };

    void arrive(){};

    boolean leave(){
        return false;
    };

    boolean isOnBase(){
        return false;
    };

    //void Vehicle(int people, int max_people, double tank_volume, double petrol_amount);
}
