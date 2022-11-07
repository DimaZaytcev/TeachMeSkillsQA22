class GroundTransport extends  Transport    {

    private int numberOfWheels;
    private int fuelConsumption;

    public GroundTransport(int horsePower, int maxSpeed, int weigh, String brand, int numberOfWheels, int fuelConsumption) {
        super(horsePower, maxSpeed, weigh, brand);

        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Количество колес: %s \tРасход топлива (л/100км): %s", numberOfWheels, fuelConsumption);
    }
}