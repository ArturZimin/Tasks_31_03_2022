package by.zimin.task7;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskSeven implements Comparator {

    public static Set<Integer> set = new HashSet<Integer>(45);

    /**
     * Задача 7.
     * Сформировать возрастающий список из чётных чисел (количество элементов 45).
     */

    public static void main(String[] args) {

        int count = 0;
        int count1 = 0;
        while (count < 45) {
            ++count1;
            if (count1 % 2 == 0) {
                set.add(count1);
                count++;
            }

        }


        System.out.println(set);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.addAll(set);
        System.out.println(treeSet);


    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == o2) {
            return 0;
        }
        Integer t = (Integer) o1;
        Integer t1 = (Integer) o2;
        if (t > t1) {
            return 1;
        } else {
            return -1;
        }

    }
}
