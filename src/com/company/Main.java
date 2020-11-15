package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        InputStream is = new FileInputStream("config.properties");
        p.load(is);
        Map<String, List<String>> documents = new HashMap<>();
        List<String> listDocumens=new ArrayList<>();
        String s = p.getProperty("A");
        listDocumens.add("A");
        Constants.isReadyC=Boolean.parseBoolean(p.getProperty("isReadyC"));
        Constants.isReadyB=Boolean.parseBoolean(p.getProperty("isReadyB"));
        String[] arrOfStr = s.split(",", 2);
        for (String a : arrOfStr)
            listDocumens.add(a);
        documents.put("A",listDocumens);


        Client c1=new Client();
        c1.proceseazaDocumente(documents,"A");
    }


}
