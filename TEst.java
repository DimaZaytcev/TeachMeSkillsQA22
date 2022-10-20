import java.util.Random;
import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {

        PC p = new PC();

        do {
            Random r = new Random();
            p.score = r.nextInt(2);

            System.out.println("Компьютер загадал число 0 или 1. У Вас есть " + (p.resource - p.attempt) + " попытки чтобы включить компьютер или он сгорит." + " Введите число от 0 до 1.");
            Scanner in = new Scanner(System.in);
            p.input = in.nextInt();

            if (p.input > 1) {
                System.out.println("Вы указали число больше 1. Программа завершила работу.");
                return;
            } else if (p.input < 0) {
                System.out.println("Вы указали число меньше 0. Программа завершила работу.");
                return;
            }

            if (p.score != p.input) {
                p.attempt = p.attempt + 1;
                System.out.println("Вы не угадали.");
            }
            if (p.score == p.input) {
                System.out.println("Вы угадали. Компьютер загадал число " + p.score);
            }

            if (p.TurnOn()) {
                p.displayInfo();
                System.out.println(" Компьютер вкл.");
                return;
            }

            if (p.TurnOff()) {
                if (p.attempt == p.resource) {
                    p.BurnedDown();
                    p.displayInfo();
                    System.out.println(" Компьютеру конец:)");
                    return;
                }
                    p.displayInfo();
                System.out.println(" Компьютер выкл.");
            }
        } while (p.isWorking);
    }
}
 class PC {
    String CPU;
    int RAM;
    int HDD;
    int resource;
    int score;
    int attempt = 0;
    int input;
    boolean isWorking = true;
    PC() {
        CPU = "Intel";
        RAM = 8;
        HDD = 256;
        resource = 3;
    }
    void displayInfo() {
        System.out.printf("CPU: %s \tRAM: %s \tHDD: %s Resource: %s", CPU, RAM, HDD, resource);
    }
    boolean TurnOn() {
        if (score == input) {
            return true;
        } else {
            return false;
        }
    }
    boolean TurnOff() {
        if (score != input) {
            return true;
        } else {
            return false;
        }
    }
    boolean BurnedDown() {
        if (resource == attempt) {
            return true;
        } else {
            return false;
        }
    }
}

