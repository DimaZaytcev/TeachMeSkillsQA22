package FirstTask;

import java.util.Scanner;


// Задание 1

public class HomeWork {

    static public void main(String[] args) {

        double result = 0;
        double day = 0;

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                day = 10;
            } else {
                day = day * 1.1;
            }
            result = result + day;
        }
        System.out.println("Result " + result);
    }
}

// Задание 2 проверить

class Ameba {
    static public void main(String[] args) {

        int ameba = 1;
        int result = 0;

        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                ameba = 1;
            }  else {
                ameba = ameba * 2;
            }
            result = ameba * 2;
        }
        System.out.println("Количество: " + result);
    }
}

// Задание 3

class task3 {
    static public void main(String[] args) {

        int i;
        int result = 0;

        for (i = 1; i <= 256; i++) {
            result = result + i;
        }
        System.out.println("Сумма: " + result);
    }
}

// Задание 4

class AB {
    static public void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println(a * b);
    }
}

// Задание 5

class Tabl {
    static public void main(String[] arg) {

        double j = 0;

        System.out.println("см" + "   |   " + "дюйм");
        System.out.println("-------------");

        for (int i = 1; i <= 20; i++) {
            j = 2.54 * i;
            System.out.println(i + "   |   " + j);
        }
    }
}

// Задание 6

class task6 {
    static public void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

// Задание 7

class task7 {
    static public void main(String[] args) {

        int result = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 > 0) {
                result = result + i;
            }
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + result);
    }
}

// Задание 8

class Risunok {
    static public void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            if (i <= 1) {
                System.out.println("   *");
            } else if (i <= 2) {
                System.out.println("  **");
            } else if (i <= 3) {
                System.out.println(" ***");
            } else {
                System.out.println("****");
            }
        }
        for (int a = 1; a < 5; a++) {
            if (a <= 1) {
                System.out.println("****");
            } else if (a <= 2) {
                System.out.println(" ***");
            } else if (a <= 3) {
                System.out.println("  **");
            } else {
                System.out.println("   *");
            }
        }
    }
}


