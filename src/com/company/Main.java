package com.company;

public class Main extends Thread{
    public static void main(String[] args) {
        StateD d = new StateD();
        StateC c = new StateC(d);
        StateB b = new StateB();
        StateA a = new StateA(b,c);
        for(int i=0;i<15;i++){
            Client c1=new Client("A",a,"A-Thread-"+i);
            Client c2 = new Client("C",c,"C-Thread-"+i);
            c2.start();
            c1.start();

        }
    }


}
