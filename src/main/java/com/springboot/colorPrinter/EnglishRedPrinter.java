package com.springboot.colorPrinter;

import org.springframework.stereotype.Component;


public class EnglishRedPrinter implements RedPrinter{

    @Override
    public String print() {

        return "RED";
    }
}
