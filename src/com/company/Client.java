package com.company;

public class Client extends Thread{
    private String stare;
    Stari st;
    private String name;

    public Client(String stare, Stari st, String name){
        this.stare = stare;
        this.st = st;
        this.name = name;

    }

    @Override
    public void run() {
        super.run();

        switch (stare){
            case "A":
                ((StateA)st).executeStateA(name);
                break;
            case "B":
                ((StateB)st).executeStateB(name);
                break;
            case "C":
                ((StateC)st).executeStateC(name);
                break;
            case "D":
                ((StateD)st).executeStateD(name);
                break;
            default:break;
        }
    }
}
