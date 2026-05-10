package com.springboot.colorPrinter;

import org.springframework.stereotype.Component;


public class EnglishBluePrinter implements BluePrinter{
    @Override
    public String print() {
        return "BLUE";
    }
}
