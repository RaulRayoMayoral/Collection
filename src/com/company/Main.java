package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Llapis> caja1 = new ArrayList<>();
        List<Llapis> caja2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            caja1.add(new Llapis((int) (Math.random()*8)));
            caja2.add(new Llapis((int)(Math.random()*8),(float)(Math.random()*3)));

        }
    }
}
