package by.zimin.task2;

import java.util.*;

public class Task2 {


    /**
     * Задача 2
     * Необходимо удалить пустые строки из списка строк.
     */

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(20) {
        };
        list.add("FGHgjn");
        list.add("FdHgjn");
        list.add("asHgjn");
        list.add("gfGHgjn");
        list.add("lkGHgjn");
        list.trimToSize();


        list.stream().forEach(x -> System.out.println(x));


    }
}
