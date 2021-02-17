package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        String[]languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int result=0;
        int var;
        int n = (int) (Math.random() * 1_000_000);
        var=CalcN(n);
        result=DigitCount(var);
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }

    public static int CalcN(int arg){

        arg = arg*3 + Integer.parseInt("10101",2) + Integer.parseInt("FF",16);
        arg = arg * 6;
        return arg;
    }

    public static int DigitCount(int arg){
        int count=0;
        int count2=0;
        while(arg>0){
            count=count+arg%10;
            arg=arg/10;
        }


        while(count>0) {count2=count2+count%10;
                        count=count/10;}
        return count2;
    }



}
