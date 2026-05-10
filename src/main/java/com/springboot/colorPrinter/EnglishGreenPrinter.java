package com.springboot.colorPrinter;

import org.springframework.stereotype.Component;


public class EnglishGreenPrinter implements GreenPrinter{
    @Override
    public String print() {
        return "GREEN";
    }
}
