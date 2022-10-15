import java.util.Random;
import java.util.Scanner;

public class Kotiki {
    public static void main(String[] args) {

        Cat p = new Cat();

        if (Cat.isAetCat()) {
            Cat.displayInfo();
            System.out.println(" Кот наелся.");
        }

        if (Cat.isHungryCat()) {
            Cat.displayInfo();
            System.out.println(" Кот голоден.");}
    }
}
class Cat {
    static String name;
    static int age;
     static int FeedQuantity;

    Cat() {
        System.out.print("Введите имя кота: ");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        System.out.print("Введите возраст кота: ");
        Scanner so = new Scanner(System.in);
        age = in.nextInt();
        Random r = new Random();
        FeedQuantity = r.nextInt(10)+1 ;
    }

    static void displayInfo() {
        System.out.printf("Name: %s \tAge: %s \tFeed Quantity: %d", name, age, FeedQuantity);
    }

    static boolean isAetCat() {
        if (FeedQuantity >= 6) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isHungryCat() {
        if (FeedQuantity <= 5) {
            return true;
        } else {
            return false;
        }
    }
}