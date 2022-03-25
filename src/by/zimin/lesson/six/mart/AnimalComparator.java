package by.zimin.lesson.six.mart;

import java.util.Comparator;

public class AnimalComparator implements Comparator <Animals>{
    @Override
    public int compare(Animals o1, Animals o2) {
        if (o1 ==  o2) {
            return 0;//equals
        }
        if (o1 == null || o2==null) {
            throw new IllegalArgumentException("Не совпадение типовпри сравнении");
        }
        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();
        return age1.compareTo(age2);

    }




    @Override
    public Comparator reversed() {
        return null;
    }
}
