class Transport {
    private int horsePower;
    private int maxSpeed;
    private int weigh;
    private String brand;

    public Transport(int horsePower, int maxSpeed, int weigh, String brand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weigh = weigh;
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    void displayInfo()  {
        System.out.printf("Мощность (л/с): %s \tМаксимальная скорость (км/ч): %s \tВес (кг): %s Бренд: %s", horsePower, maxSpeed, weigh, brand);
    }
}