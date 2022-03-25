package by.zimin.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TaskFive {


    /**
     * Задача 5
     * Необходимо вывести список в обратном порядке.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(100);
        Random random=new Random();
        while (true){
            if (list.size()<100){
                list.add(random.nextInt((100)*1)+9);
            }else {
                break;
            }
        }

        System.out.println(list);

        ArrayList<Integer>list1=new ArrayList<Integer>();
        for(int i=list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }
        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);

        list1.removeIf(x-> x.equals(45));
        list1.removeIf(x-> x.equals(34));
        list1.removeIf(x-> x.equals(23));
        System.out.println(list1);
    }
}
