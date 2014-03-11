package com.company.lw01;

import com.company.lw01.controller.Controller;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome here!");
        Controller c = new Controller();
        c.run();
        System.out.println("Goodbye");
    }
}
