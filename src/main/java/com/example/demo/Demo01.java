package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01 {
     public static void main(String[]args) {
         Demo01 demo01 =new Demo01();
       demo01.demolist();
         demo01.demonMap();
         
     }

    private void demonMap() {
        Map<String, Integer> names = new HashMap<>();
        names.put("n1", 20);
        names.put("n2", 30);
        names.put("n2", 40);
        Set<String>  keys = names.keySet();
        for (String key:keys) {
            System.out.println(key+"="+names.get(key));
                    }
    }

    private void demolist() {
        System.out.println("Call demonList");
        // Generic
        List<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
        for (String name : names) {
            System.out.println(name);
            
        }
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
