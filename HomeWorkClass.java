import java.util.Random;
import java.util.Scanner;

public class HomeWorkClass {
    public static void main(String[] args) {

        PC p = new PC();

        if (PC.TurnOn()) {
            PC.displayInfo();
            System.out.println("Компьютер вкл.");
        }

        if (PC.TurnOff()){
            PC.displayInfo();
            System.out.println("Компьютер выкл.");
        }

        if (PC.BurnedDown()) {
            PC.displayInfo();
            System.out.println("Компьютеру конец:)");
        }

    }
}

class PC {

    static String CPU;
    static int RAM;
    static int HDD;
    static int resource;
    static int score;
    static int attempt;
    static int s;

    PC() {
       CPU = "Intel";
       RAM = 8;
       HDD = 256;
       resource = 3;
       Random r = new Random();
       score = r.nextInt(1)+1;

        System.out.print("Введите число от 0 до 1.");
        Scanner in = new Scanner(System.in);
        s = in.nextInt();


    }
    static void displayInfo() {
        System.out.printf("CPU: %s \tRAM: %s \tHDD: %s Resourse: %s \tScore: %s", CPU, RAM, HDD, resource, score);
    }

    static boolean TurnOn() {
        if (score == s) {
            return true;
        } else {
            return false;
        }
    }
    static boolean TurnOff() {
        if (score != s) {
            return true;
        } else {
            return false;
        }
    }
    static boolean BurnedDown() {
        if (resource == attempt) {
            return true;
        } else {
            return false;
        }
    }

}
