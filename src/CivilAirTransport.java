import java.util.Random;

class CivilAirTransport extends AirTransport    {

    Random cat = new Random();
    int numberOfPassenger;
    boolean businessClass;
    int passenger;
    private double wattPower;

    public CivilAirTransport(int horsePower, int maxSpeed, int weigh, String brand, int wingspan, int minRunwayLength, int numberOfPassenger, boolean businessClass) {
        super(horsePower, maxSpeed, weigh, brand, wingspan, minRunwayLength);

        this.numberOfPassenger = numberOfPassenger;
        this.businessClass = businessClass;

        setHorsePower(5000);
        setMaxSpeed(700);
        setWeigh(50);
        setBrand("Boeing");
        setWingspan(60);
        setMinRunwayLength(3000);
        setNumberOfPassenger(200);
        setBusinessClass(cat.nextBoolean());
        calculateWattPowerForCivilAirTransport();
    }

    public void passengers()    {
        passenger = cat.nextInt(350);
        System.out.println();
        if (passenger <= getNumberOfPassenger())
            System.out.println("В самолете занято: " + passenger + " мест.");
        else
            System.out.println("В самолете недостаточно мест! " + passenger + " пассажира.");
    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    private void calculateWattPowerForCivilAirTransport()   {
        wattPower = (double) getHorsePower() * 0.74;
    }

    private void businessClassMod()    {
        if (getBusinessClass() == true)
            System.out.println("В самолете есть бизнес класс.");
        else
            System.out.println("В самолете нет бизнес класса.");
    }

    void displayInfo()  {
        System.out.println();
        System.out.println("Гражданский самолет.");
        super.displayInfo();
        System.out.printf("  Количесто пассажиров: %s \tНаличие бизнесс класса: %s \tМощность (кВ): %s", numberOfPassenger, businessClass, wattPower);
        passengers();
        businessClassMod();
    }
}