import java.util.Random;

class Truck extends GroundTransport {

    Random t = new Random();
    private int carrying;
    private int placeInTheTruck;
    private double wattPower;

    public Truck(int horsePower, int maxSpeed, int weigh, String brand, int numberOfWheels, int fuelConsumption, int placeInTheTruck) {
        super(horsePower, maxSpeed, weigh, brand, numberOfWheels, fuelConsumption);

        this.placeInTheTruck = placeInTheTruck;

        setHorsePower(300);
        setMaxSpeed(160);
        setWeigh(20);
        setBrand("MAZ");
        setNumberOfWheels(10);
        setFuelConsumption(40);
        setPlaceInTheTruck(25);
        calculateWattPowerForTruck();
    }

    public int getPlaceInTheTruck() {
        return placeInTheTruck;
    }

    public void setPlaceInTheTruck(int placeInTheTruck) {
        this.placeInTheTruck = placeInTheTruck;
    }

    public void carrying()   {
        carrying = t.nextInt(100);
        System.out.println();
        if (carrying <= getPlaceInTheTruck())
            System.out.println("Грузовик заполнен на: " + carrying + "(т).");
        else
            System.out.println("Вам нужен грузовик побольше! " + carrying + "(т).");
    }

    private void calculateWattPowerForTruck()   {
        wattPower = (double) getHorsePower() * 0.74;
    }

    public void displayInfo()   {
        System.out.println();
        System.out.println("Грузовик.");
        super.displayInfo();
        System.out.printf("  Грузоподъемность (т): %s \tМощность (кВ): %s", placeInTheTruck, wattPower);
        carrying();
    }
}