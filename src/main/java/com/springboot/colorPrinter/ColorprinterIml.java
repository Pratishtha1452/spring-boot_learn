package com.springboot.colorPrinter;

import org.springframework.stereotype.Component;

@Component
public class ColorprinterIml implements ColorPrinte{

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorprinterIml(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
    }
    @Override
    public String print() {
        return redPrinter.print() + " " + bluePrinter.print() + " " + greenPrinter.print();
    }
}
