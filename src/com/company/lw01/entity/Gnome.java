package com.company.lw01.entity;

/**
 * Created by vova on 3/4/14.
 * <p>Класс Gnome, реализующий сущность Гном</p>
 */
public class Gnome {
    private int age;
    private int capacity;
    private String name;

    public Gnome(int age, int capacity, String name){
        this.age = age;
        this.capacity = capacity;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getCapacity(){
        return capacity;
    }
}
