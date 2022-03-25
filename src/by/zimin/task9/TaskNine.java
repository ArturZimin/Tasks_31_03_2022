package by.zimin.task9;

import java.util.ArrayList;
import java.util.Random;

public class TaskNine {

    public static Integer indexMaxElement;
    public static Integer indexMinElement;


    public static void setIndexMaxElement(Integer indexMaxElement) {
        TaskNine.indexMaxElement = indexMaxElement;
    }


    public static void setIndexMinElement(Integer indexMinElement) {
        TaskNine.indexMinElement = indexMinElement;
    }

    /**
     * Задача 9.
     * Найти наибольший элемент списка и вывести его на экран;
     * Определите, есть ли в списке повторяющиеся элементы, если да, то вывести на экран это значение;
     * Поменять местами самый большой и самый маленький элементы списка
     */

    public static void main(String[] args) {
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
        System.out.println(list);
        checkRepeatTheNumbersInList(list);

        System.out.println("Max element = " + findMaxElem(list));
        System.out.println("Min element = " + findMinElem(list));
        Integer temp = list.get(indexMaxElement);
        list.set(indexMaxElement, findMinElem(list));
        list.set(indexMinElement, temp);
        System.out.println(list);


    }

    public static void checkRepeatTheNumbersInList(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 2) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        ++count;
                        System.out.println(list.get(i) + " repeat " + count);
                    }
                }
            }
            count = 0;
        }
    }

    public static Integer findMaxElem(ArrayList<Integer> list) {

        int max = list.get(0);
        setIndexMaxElement(0);
        int count = 1;
        for (Integer i : list) {
            if (count < list.size()) {
                if (list.get(count) > max) {
                    max = list.get(count);
                    setIndexMaxElement(count);
                }
                count++;
            }
        }
        return max;
    }

    public static Integer findMinElem(ArrayList<Integer> list) {

        int min = list.get(0);
        setIndexMinElement(0);
        int count = 1;
        for (Integer i : list) {
            if (count < list.size()) {
                if (list.get(count) < min) {
                    min = list.get(count);
                    setIndexMinElement(count);
                }
                count++;
            }
        }
        return min;
    }
}
