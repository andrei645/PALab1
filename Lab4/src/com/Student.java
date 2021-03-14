package com;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public  class Student implements Comparator<Student> {

    private String name;

    private List<String> list = new LinkedList<>();

    public Student(String newName){
        this.name = newName; //numeste
    }

    public void addPreference(String preference){
        list.add(preference); //adauga la lista preferinta
    }

    public List<String> getPreference(){
        return list;
    } //returneaza lista de prerinte

    public String getName() {
        return name;
    }


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.length() > o2.name.length())
            return 1;
        return 0;
    }
}