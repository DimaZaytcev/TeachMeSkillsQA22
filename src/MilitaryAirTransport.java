import java.util.Random;

public class MilitaryAirTransport extends AirTransport {

    Random mat = new Random();
    boolean ejectionSystem;
    int numberOfMissilesOnBoard;
    private double wattPower;

    public MilitaryAirTransport(int horsePower, int maxSpeed, int weigh, String brand, int wingspan, int minRunwayLength, boolean ejectionSystem, int numberOfMissilesOnBoard) {
        super(horsePower, maxSpeed, weigh, brand, wingspan, minRunwayLength);

        this.ejectionSystem = ejectionSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;

        setHorsePower(10000);
        setMaxSpeed(2600);
        setWeigh(18500);
        setBrand("Su-57");
        setWingspan(14);
        setMinRunwayLength(400);
        setNumberOfMissilesOnBoard(mat.nextInt(9));
        setEjectionSystem(mat.nextBoolean());
        calculateWattPowerForMilitaryAirTransport();
    }

    public int getNumberOfMissilesOnBoard() {
        return numberOfMissilesOnBoard;
    }

    public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    public boolean getEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public void shoot() {
        System.out.println();
        if (getNumberOfMissilesOnBoard() >= 1)
            System.out.println("Ракета пошла...");
        else
            System.out.println("Боеприпасы отсутствуют.");
    }

    public void ejectionSystem()    {
        if (getEjectionSystem() == true)
            System.out.println("Катапультирование прошло успешно!");
        else
            System.out.println("У Вас нет системы катапультирования :(");
    }

    private void calculateWattPowerForMilitaryAirTransport()    {
        wattPower = (double) getHorsePower() * 0.74;
    }

    public void displayInfo()  {
        System.out.println();
        System.out.println("Военный самолет.");
        super.displayInfo();
        System.out.printf("  Система катапультирования: %s \tКоличество ракет на борту: %s \tМощность (кВ): %s", ejectionSystem, numberOfMissilesOnBoard, wattPower);
        shoot();
        ejectionSystem();
    }
}