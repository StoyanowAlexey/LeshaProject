package LB3.clases;

import static java.lang.Math.min;

class Bus implements LB3.interfaces.Bus {

    int max_people;
    int people;
    double max_petrol;
    double petrol;
    boolean isOnBase;

    @Override
    public void Bus(int max_people, int people, double max_petrol, double petrol) {
           this.max_petrol = max_petrol;
           this.max_people = max_people;
           this.people = people;
           this.petrol = petrol;
    }

    @Override
    public int getPeopleMax() {
        return max_people;
    }

    @Override
    public int getPeople() {
        return people;
    }


    public void set(double petrol,int people) {
        this.petrol = petrol;
        this.people = people;
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
         if(isOnBase == true) {
             Base.vehicles_on_base++;
             Base.people_on_base += people;
             Base.petrol_on_base += petrol;
             petrol = 0;
             people = 0;
         }
    }

    @Override
    public boolean leave() {
        petrol = max_petrol;
        Base.petrol_on_base -= petrol;
        people = min(max_people , Base.people_on_base);
        Base.people_on_base -= people;
        if(petrol == max_petrol && min(max_people, Base.people_on_base) == people && Base.people_on_base != 0){
            Base.vehicles_on_base --;
            isOnBase = false;
            return false;
        }
        else return true;
    }

    @Override
    public boolean isOnBase() {
        return isOnBase;
    }
}
