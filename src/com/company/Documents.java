package com.company;

public class Documents extends Thread{
    private String name;
    public Documents(String s) {
        name=s;
        System.out.println("Am ajuns la documentul "+name);
    }
    public void run(){
        System.out.println("Procesz documentul"+name);
        if(name.equals("A")){
            while(!Constants.isReadyB ){
                System.out.println("A-Astept obtinere documente b");
            }
            while(!Constants.isReadyC){
                System.out.println("A-Astept obtinere documente C");
            }
            System.out.println("A a fost obtinut");
        }
        if(name.equals("B")){
            while(!Constants.isReadyC){
                System.out.println("Se asteapta dupa documentul C");
            }
            Constants.isReadyB=true;
            System.out.println("B a fost obtinut");
        }
        if(name.equals("C")){
            Constants.isReadyC=true;
            System.out.println("Documentul C a fost obtinut");
        }
    }
}
