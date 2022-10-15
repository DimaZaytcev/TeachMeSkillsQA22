package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Задание 1

public class HomeWorkTask3 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int n = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                mas[n] = i;
                System.out.print(mas[n] + " ");
            }
        }
    }
}

// Задание 2 доделать

class Task2 {
    public static void main(String[] args) {

        int[] mas = new int[50];
        int n = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                mas[n] = i;
                System.out.print(mas[n] + " ");
                n++;
            }
        }

        System.out.println();

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}

// Задание 3

class Task3 {
    public static void main(String[] args) {

    int[] mas = new int[15];
    int a = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 99));
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0) {
                a = a + 1;
            }
        }
        System.out.println();
        System.out.println("Количество четных чисел: " + a);
    }
}

// Задание 4

class Task4 {
    public static void main(String[] args) {

        int[] mas = new int[20];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 20));
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 > 0) {
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }
    }
}

// Задание 5

class Task5 {
    public static void main(String[] args) {

        int[] mark = new int[5];
        int[] mas = new int[5];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < mark.length; i++) {
            mark[i] = (int) Math.round((Math.random() * 15));
            System.out.print( mark[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 15));
            System.out.print( mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mark.length; i++) {
            if (i >= 0) {
                sum1 = sum1 + mark[i];
            }
        }
        System.out.println("Сумма элементов массива mark: " + sum1);

        for (int i = 0; i < mas.length; i++) {
            if (i >= 0) {
                sum2 = sum2 + mas[i];
            }
        }
        System.out.println("Сумма элементов массива mas: " + sum2);

        if (sum1 > sum2) {
            System.out.println("Среднее арифметическое элементов массива mark больше");
        } else if (sum1 < sum2) {
            System.out.println("Среднее арифметическое элементов массива mas больше");
        } else {
            System.out.println("Среднее арифметическое элементов массивов mark и mas равны");
        }
    }
}

// Задание 6

class Task6 {
    public static void main(String[] args) {

        int[] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 10));
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        if (mas[0] < mas[1] && mas[1] < mas[2] && mas[2] < mas[3]) {
            System.out.println("Массив является строговозрастающим");
        } else {
            System.out.println("Массив не является строго возрастающим");
        }
    }
}

// Задание 7

class Task7 {
    public static void main(String[] args) {

        int[] mas = new int[12];
        int max = mas[0];
        int index = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 15));
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= max) {
            max = mas[i];
            index = i;
            }
        }
        System.out.println("Самое большое число: " + max + " и индекс его последнего вхождения: " + index);
    }
}

// Задание 8

class Task8 {
    public static void main(String[] args) {

        int[] mas = new int[10];
        int[] mas1 = new int[10];
        double[] mas2 = new double[10];
        int a = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 9));
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) Math.round((Math.random() * 9));
            System.out.print(mas1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (double) mas[i] / mas1[i];
            System.out.print(mas2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] % 1 == 0) {
                a = a + 1;
            }
        }
        System.out.println("Количество целых элементов массива mas2: " + a);
    }
}

// Задание 9

class Task9 {
    public static void main(String[] args) {

        System.out.println("Введите четное число: ");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        if (n % 2 > 0) {
            System.out.println("Число не является четным!");
            return;
        }

        int[] mas = new int[n];
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 15));
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (i < n / 2) {
                sum = sum + mas[i];
            }
            else {
                sum1 = sum1 + mas[i];
            }
        }
        System.out.println("Сумма первой половины массива: " + sum);
        System.out.println("Сумма второй половины массива: " + sum1);

        if (sum > sum1) {
            System.out.println("Сумма правой части массива больше!");
        } else if (sum < sum1) {
            System.out.println("Сумма левй части массива больше!");
        } else {
            System.out.println("Суммы левой и правой части массива равны!");
        }
    }
}

// Задание 10

class Task10 {
    public static void main(String[] args) {

        System.out.println("Введите число больше 3: ");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        if (n < 3) {
            System.out.println("Ошибка: число не больше 3!");
            return;
        }

        int j = 0;
        int[] mas = new int[n];
        int[] mas1 = {j};

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * n));
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                mas1[j] = mas[i];
                System.out.print(mas1[j] + " ");
            }
        }
    }
}