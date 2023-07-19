package LB3.clases;

import static java.lang.Math.min;

class Truck implements LB3.interfaces.Truck {
    double max_load;
    double load;
    double petrol;
    double max_petrol;
    boolean isOnBase;
    @Override
    public void Truck(double load, double max_load, double petrol, double max_petrol) {
        this.load = load;
        this.max_load = max_load;
        this.petrol = petrol;
        this.max_petrol = max_petrol;
    }

    @Override
    public double getCurrentLoad() {
        return load;
    }

    @Override
    public double getMaxLoad() {
        return max_load;
    }

    @Override
    public void Vehicle(double tank_volume, double petrol_amount) {

    }

    @Override
    public double getTankVolume() {
        return max_petrol;
    }

    @Override
    public double getPetrolAmount() {
        return petrol;
    }

    @Override
    public void arrive() {
         isOnBase = true;
         if(isOnBase == true){
             Base.petrol_on_base += petrol;
             petrol = 0;
             Base.goods_on_base += load;
             Base.people_on_base++;
             Base.vehicles_on_base++;
             load = 0;
         }
    }

    @Override
    public boolean leave() {
        petrol = max_petrol;
        Base.petrol_on_base -= max_petrol;
        load = min(max_load,Base.goods_on_base);
        Base.goods_on_base -= load;
        if(petrol == max_petrol && load == min(max_load,Base.goods_on_base)){
            Base.vehicles_on_base--;
            isOnBase = false;
            return false;
        }
        else {
            isOnBase = true;
            return true;

        }
    }

    @Override
    public boolean isOnBase() {
        return isOnBase;
    }

    public void set(double petrol, double load){
        this.petrol = petrol;
        this.load = load;
    }

}
