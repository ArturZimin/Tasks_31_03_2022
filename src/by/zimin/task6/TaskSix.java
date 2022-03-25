package by.zimin.task6;

import java.util.LinkedList;

public class TaskSix {

    /**
     * Задача 6
     * Заполнить список ста нулями, кроме первого и последнего элементов, которые должны быть равны единице.
     */

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            if (i == 0 || i == 99) {
                list.add(1);
            } else {
                list.add(0);
            }
        }
        System.out.println(list);
    }
}
