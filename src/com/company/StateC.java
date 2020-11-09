package com.company;

public class StateC implements Stari{
    private StateD d;

    public StateC(StateD d) {
        this.d = d;
    }

    public synchronized void executeStateC(String name){
        System.out.println(name+":Documentul C nu poate fi obtinut fara documentul D: va redirectionam la ghiseul respectiv");
        d.executeStateD(name);
        System.out.println(name+" :Ati obtinut documentul C");

    }

}
