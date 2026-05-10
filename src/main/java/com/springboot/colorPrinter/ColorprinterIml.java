package com.springboot.colorPrinter;

public class ColorprinterIml implements ColorPrinte{

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    ColorprinterIml(){
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
    }
    @Override
    public String print() {
        return redPrinter.print() + " " + bluePrinter.print() + " " + greenPrinter.print();
    }
}
