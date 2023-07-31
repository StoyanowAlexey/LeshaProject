package LB3.clases;

public class Vehicle extends LB3.interfaces.Vehicle {
    private double tank_volume;
    private double petrol_amount;
    private boolean isOnBase;
    public void Vehicle(double tank_volume, double petrol_amount) {
        this.petrol_amount = petrol_amount;
        this.tank_volume = tank_volume;
    }


    public double getTankVolume() {
        return tank_volume;
    }


    public double getPetrolAmount() {
        return petrol_amount;
    }


    public void arrive() {
        isOnBase = true;
          if(isOnBase == true){
              Base.people_on_base++;
              Base.vehicles_on_base++;
          }
    }

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

    public boolean isOnBase() {
        return isOnBase;
    }
    public void set(double petrol_amount){
        this.petrol_amount = petrol_amount;
    }

}
