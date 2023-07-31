package LB3.clases;

public class Main {
    public static void main(String [] args){
        int people,max_people;
        boolean result;
        double petrol,max_petrol,load,max_load;


        System.out.println("Class Vehicle");
        Vehicle vehicle = new Vehicle();
        Base.print();
        vehicle.Vehicle(100, 50);
        result = vehicle.leave();
        petrol = vehicle.getPetrolAmount();
        max_petrol = vehicle.getTankVolume();
        System.out.println("Result = " + result);
        System.out.println("Petrol = " + petrol);
        System.out.println("Max petorl = " + max_petrol);
        Base.print();
        vehicle.set(50);
        System.out.println("Petrol (after method set() )" + vehicle.getPetrolAmount());
        vehicle.arrive();
        Base.print();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Class Bus");
        Bus bus = new Bus();
        bus.Bus(20, 10,100, 50);
        Base.print();
        result = bus.leave();
        people = bus.getPeople();
        max_people = bus.getPeopleMax();
        System.out.println("result = " + result + ", people = " + people + ", max_people = " + max_people);
        Base.print();
        System.out.println("On base? - " + bus.isOnBase());
        bus.set(20,10);
        bus.arrive();
        Base.print();
        System.out.println();
        System.out.println();
        System.out.println();


        Truck truck = new Truck();
        truck.Truck(20,60,50,100);
        Base.print();
        result = truck.leave();
        petrol = truck.getPetrolAmount();
        load = truck.getCurrentLoad();
        System.out.println("Result = " + result + "petrol = " + petrol + "load = " + load);
        Base.print();
        truck.set(50,50);
        System.out.println("Method Set(petrol = 50, load = 50)");
        truck.arrive();
        Base.print();

    }
}
