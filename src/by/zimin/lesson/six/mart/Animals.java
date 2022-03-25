package by.zimin.lesson.six.mart;

import java.util.Objects;

public class Animals implements Comparable {

    private String name;
    private int age;
    private String color;


    public Animals(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(color, animals.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == (Animals) o) {
            return 0;//equals
        }
        if (o == null || getClass() != o.getClass()) {
            throw new IllegalArgumentException("Не совпадение типовпри сравнении");
        }
        Integer age1 = this.getAge();
        Integer age2 = ((Animals) o).getAge();
        return age1.compareTo(age2);

//        Animals animal1=this;
//        Animals animals2=(Animals) o;
//            if (animal1.getAge()<animals2.getAge()){
//                return -1;
//            }else {
//                return 1;
        //        }

    }
}
