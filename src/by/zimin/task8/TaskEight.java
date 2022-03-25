package by.zimin.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class TaskEight {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Задача 8.
     * Пользователь вводит число. Определить, содержит ли список данное число x. Если содержит,
     * то вывести на экран число 7145, если не содержит, то вывести на экран число 5741;
     * Найдите сумму и произведение элементов списка. Результаты вывести на экран.
     */

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>(20);
        Random random = new Random();
        int count = 0;
        while (true) {
            if (count < 20) {
                list.add(random.nextInt(50));
            } else {
                break;
            }
            count++;
        }

        System.out.println("Enter the number from 0 - 50 ");
        String check = "[0-50]";
        String read = br.readLine();
        Integer stringToInt = null;
        if (read.matches(check)) {
            stringToInt = Integer.parseInt(read);
        }
        boolean contain = list.contains(stringToInt);
        if (contain) {
            System.out.println("-------7145-------");
        } else {
            System.out.println("-------5741-------");
        }
        int countOn = 0;
        int productOfNumber = 0;
        for (Integer i : list) {
            countOn += i.intValue();
            productOfNumber += i * i;
        }

        System.out.println(" Sum of elements = " + countOn);
        System.out.println("Sum of elements and product = " + productOfNumber);


    }

}
