import java.util.Random;
import java.util.Scanner;

class PassengerCar extends GroundTransport  {

    Scanner pc = new Scanner(System.in);
    double time;
    String typeOfBody;
    int numberOfPassenger;
    private double distance;
    double fuelConsumptionAllTime;
    private double wattPower;

    public PassengerCar(int horsePower, int maxSpeed, int weigh, String brand, int numberOfWheels, int fuelConsumption, String typeOfBody, int numberOfPassenger) {
        super(horsePower, maxSpeed, weigh, brand, numberOfWheels, fuelConsumption);

        this.typeOfBody = typeOfBody;
        this.numberOfPassenger = numberOfPassenger;

        setHorsePower(100);
        setMaxSpeed(250);
        setWeigh(1830);
        setBrand("Audi");
        setNumberOfWheels(4);
        setFuelConsumption(10);
        setTypeOfBody("coupe");
        setNumberOfPassenger(4);
        calculateDistance();
        calculateConsumption();
        calculateWattPowerForPassengerCar();
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public void calculateWattPowerForPassengerCar()    {
        wattPower = (double) getHorsePower() * 0.74;
    }

    public void calculateDistance()   {
        System.out.println("Введите время в пути.");
        time = pc.nextDouble();
        distance = (double) getMaxSpeed() * time;
    }

    private void calculateConsumption()  {
        fuelConsumptionAllTime = getFuelConsumption() * distance / 100;
    }

    public void description()   {
        System.out.println();
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет " + distance + " км и израсходует " + fuelConsumptionAllTime + " литров топлива.");
    }

    public void displayInfo()   {
        System.out.println("Легковой автомобиль.");
        super.displayInfo();
        System.out.printf("  Тип корпуса: %s \tКоличество пассажиров: %s \tМощность (кВ): %s", typeOfBody, numberOfPassenger, wattPower);
    }
}