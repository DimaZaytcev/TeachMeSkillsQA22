public class Main {
    public static void main(String[] args)  {

        PassengerCar pc = new PassengerCar(1, 1, 1, "", 1, 1, "", 1);
        pc.displayInfo();
        pc.description();

        Truck t = new Truck(1, 1, 1, "", 1, 1, 1);
        t.displayInfo();

        CivilAirTransport cat = new CivilAirTransport(1, 1, 1, "", 1, 1, 1, true);
        cat.displayInfo();

        MilitaryAirTransport mat = new MilitaryAirTransport(1, 1, 1, "", 1, 1, true, 1);
        mat.displayInfo();

    }
}