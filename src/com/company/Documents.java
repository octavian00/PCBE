package com.company;

public class Documents extends Thread{
    private String name;
    public Documents(String s) {
        name=s;
        System.out.println("Am ajuns la documentul "+name);
    }
    public void run()
    {
        System.out.println("Procesz documentul "+name);
        if(name.equals("A")){
            sleepp();
            if(!Constants.isReadyB)
            {
                Constants.esuatB=true;
                return;
            }
            if(!Constants.isReadyC)
            {
                Constants.esuatC=true;
                return;
            }
            System.out.println("A a fost obtinut");
        }
        if(name.equals("B"))
        {
            sleepp();
            if(Constants.esuatB)
            {
                System.out.println("Documentul B a esuat");
                return;
            }
            if(Constants.isReadyC)
            {
                Constants.isReadyB=true;
                System.out.println("B a fost obtinut");
            }
        }
        if(name.equals("C"))
        {
            sleepp();
            if(Constants.esuatC)
            {
                System.out.println("Documentul C a esuat");
                return;
            }
            Constants.isReadyC=true;
            System.out.println("C-Documentul C a fost obtinut");
        }
    }
    void sleepp()
    {
        try
        {
            sleep((long) (Math.random()*1000));
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
