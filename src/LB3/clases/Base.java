package LB3.clases;

class Base {
    static int people_on_base = 600;
    static int vehicles_on_base = 100;
    static double petrol_on_base = 5000;
    static double goods_on_base = 600;
    public static void print(){
        System.out.println("People on base - " + people_on_base);
        System.out.println("Vehicles on base - " + vehicles_on_base);
        System.out.println("Petrol on base - " + petrol_on_base);
        System.out.println("Goods on base - " + goods_on_base);
        System.out.println();
    }
}