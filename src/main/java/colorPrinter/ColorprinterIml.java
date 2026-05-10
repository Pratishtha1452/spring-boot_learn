package colorPrinter;

public class ColorprinterIml implements ColorPrinte{

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    ColorprinterIml(){
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.redPrinter = new EnglishRedPrinter();
    }
    @Override
    public String print() {
        return redPrinter.print() + " " + bluePrinter.print() + " " + greenPrinter.print();
    }
}
