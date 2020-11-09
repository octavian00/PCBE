package com.company;

public class StateB implements Stari{

    public synchronized void executeStateB(String name){
        System.out.println(name+":Ati obtinut documentul B");

    }

}
