package com;

import java.util.TreeSet;


public class School implements Comparable <School> {

    private String name;
    private TreeSet<String> ts = new TreeSet<String>();

    public School(String newName){
        this.name = newName;
    }

    public void addPreference (String preference){
        ts.add(preference);
    }
    public TreeSet<String> getPreference(){
        return ts;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(School o) {
        return 0;
    }
}
