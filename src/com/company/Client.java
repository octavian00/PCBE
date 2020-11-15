package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Client {
    public void proceseazaDocumente(Map<String, List<String>> documents, String a) {
        List<String> listdocuments=new ArrayList<>();
        for(Map.Entry<String, List<String>> entry:documents.entrySet()) {
            if (entry.getKey() == a) {
                listdocuments=entry.getValue();
            }
        }
        for(String s:listdocuments){
            Documents d =new Documents(s);
            d.start();
        }
    }
}
