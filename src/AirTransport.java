class AirTransport extends Transport    {

    private int wingspan;
    private int minRunwayLength;

    public AirTransport(int horsePower, int maxSpeed, int weigh, String brand, int wingspan, int minRunwayLength) {
        super(horsePower, maxSpeed, weigh, brand);

        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }

    void displayInfo()  {
        super.displayInfo();
        System.out.printf("  Размах крыльев (м): %s \tМинимальная длина взлетно-посадочный полосы (м): %s", wingspan, minRunwayLength);
    }
}