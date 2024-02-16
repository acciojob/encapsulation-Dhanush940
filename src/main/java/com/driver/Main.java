package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
//        obj.name="Hi";
        obj.setName("Dhanush");
        System.out.print(obj.getName());
    }
}