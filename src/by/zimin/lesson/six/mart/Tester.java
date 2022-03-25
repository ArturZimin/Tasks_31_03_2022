package by.zimin.lesson.six.mart;

import by.zimin.lesson.six.mart.AnimalComparator;
import by.zimin.lesson.six.mart.Animals;

import java.util.*;

public class Tester {

    public static void main(String[] args) {

        HashSet<String> set2 = new HashSet<>(100);
        set2.add("Minsk");
        set2.add("Kiev");
        set2.add("Warszawa");
        set2.add("Moscow");
        set2.add("Berlin");
        set2.add("New-York");
        set2.add("Kiev");
        System.out.println(set2.toString());

//        set.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1-o2;
//            }
        //       })

        HashSet<Animals> set = new HashSet<>(100);
        Animals animals1=new Animals("Dog",3,"Grey");
        Animals animals2=new Animals("Cat",4,"Blu");
        Animals animals3=new Animals("Pig",6,"Black");
        Animals animals5=new Animals("Pig",6,"Black");
        Animals animals4=new Animals("Monkey",4,"Grey");
        set.add(animals1);
        set.add(animals2);
        set.add(animals3);
        set.add(animals4);
        System.out.println(set.toString());
        set.removeIf(animals -> "Cat".equals(animals.getName()));
        System.out.println(set);

        LinkedHashSet <String> linkedHashSet=new LinkedHashSet<>(100);
        linkedHashSet.add("Grodno");
        linkedHashSet.add("Gomel");
        linkedHashSet.add("Mogilev");
        linkedHashSet.add("Brest");
        linkedHashSet.add("Baranovici");
        linkedHashSet.add("Volkovysk");
        linkedHashSet.add("Volkovysk");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("Grodno");
        treeSet.add("Arodno");
        treeSet.add("Qrodno");
        treeSet.add("Srodno");

        System.out.println(treeSet);


        ArrayList<Animals>animalsList=new ArrayList<>();
        animalsList.addAll(set);
        animalsList.sort(new AnimalComparator());
        System.out.println(animalsList);


    }
}
