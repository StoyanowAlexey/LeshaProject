package LB3.clases;

public class Vehicle implements LB3.interfaces.Vehicle {
    double tank_volume;
    double petrol_amount;
    boolean isOnBase;
    @Override
    public void Vehicle(double tank_volume, double petrol_amount) {
        this.petrol_amount = petrol_amount;
        this.tank_volume = tank_volume;
    }

    @Override
    public double getTankVolume() {
        return tank_volume;
    }

    @Override
    public double getPetrolAmount() {
        return petrol_amount;
    }

    @Override
    public void arrive() {
        isOnBase = true;
          if(isOnBase == true){
              Base.people_on_base++;
              Base.vehicles_on_base++;
          }
    }

    @Override
    public boolean leave() {
        Base.petrol_on_base += petrol_amount;
        petrol_amount = tank_volume;
        Base.petrol_on_base -= tank_volume;
        if(petrol_amount != tank_volume) {
            return true;
        }
        else {
            Base.people_on_base--;
            Base.vehicles_on_base--;
            isOnBase = false;
            return false;
        }
    }

    @Override
    public boolean isOnBase() {
        return isOnBase;
    }
    public void set(double petrol_amount){
        this.petrol_amount = petrol_amount;
    }

}
