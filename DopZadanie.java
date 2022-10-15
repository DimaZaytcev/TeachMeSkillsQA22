package DopZadanie;

import java.util.Random;
import java.util.Scanner;

public class DopZadanie {
    public static void main(String[] args) {

        int composition = 1;
        int a = 0;
        double avg = 0;


        System.out.print("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        System.out.print("Введите некторое число C для 3 задания: ");
        Scanner cs = new Scanner(System.in);
        int c = 0;
        if (sc.hasNextInt()) {
            c = sc.nextInt();
        }
        System.out.print("Введите любое число m для 7 задания: ");
        Scanner cc = new Scanner(System.in);
        int m = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
        }

        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 100));
            System.out.print(mas[i] + " ");
        }

        System.out.println();
// 1
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0) {
                composition = composition * mas[i];
            }
        }
        System.out.println("Произведение чисел кратных 3: " + composition);

// 2
        for (int i = 1; i < mas.length; i = i + 2) {
            a = a + 1;
            avg = (double)avg + mas[i];
        }
        System.out.println("Среднее арифметическое элементов с нечетными номерами: " + avg / a);

// 3
        double avg1 = 0;
        int g = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > c) {
                avg1 = avg1 + mas[i];
                g = g + 1;
            }
        }
        System.out.println("Среднее арифметическое элементов болше числа С: " + avg1 / g);

// 4
        int min = mas[0];
        for (int i = 1; i < mas.length; i = i + 2) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Наименьший нечетный элемент: " + min);

// 5
        for (int i = 1; i < mas.length; i +=2) {
            mas[i] = 0;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

// 6
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    System.out.println("В массивае есть повторяющиеся числа.");
                    break;
                }
            }
        }
        System.out.println();

// 7
        int p = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == m) {
                p = p + 1;
            }
        }
        System.out.println("Число " + m + " в массиве встречается: " + p + " раз");

// 8
        int highest = 0;
        int secondHighest = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > highest) {
                secondHighest = highest;
                highest = mas[i];
            } else if (mas[i] > secondHighest) {
                secondHighest = mas[i];
            }
        }
        System.out.println("Второе по величине ваксимальное число: " + secondHighest);


// 9
        int min1 = mas[0];
        for (int i = 0; i < mas.length; i += 2) {
            if (mas[i] < min1){
                min1 = mas[i];
            }
        }
        System.out.println("Минимальное число среди чисел с четными индексами: " + min1);

//10
        int maxAll = mas[0];
        int index = 0;
        int temp;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxAll) {
                maxAll = mas[i];
                index = i;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            temp = mas[0];
            mas[0] = mas[index];
            mas[index] = temp;
            System.out.print(mas[i] + " ");
        }









    }
}
