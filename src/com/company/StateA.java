package com.company;

public class StateA implements Stari{
    private StateB b;
    private StateC c;

    public StateA(StateB b, StateC c) {
        this.b = b;
        this.c = c;

    }

    public synchronized void executeStateA(String name){
        System.out.println(name+":Documentul A nu poate fi obtinut fara documentele B si C: va redirectionam la ghiseele respective");
        b.executeStateB(name);
        c.executeStateC(name);
        System.out.println(name+" :Am obtinut documentul A");

    }

}
