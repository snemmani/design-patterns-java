package design.patterns.java.snemmani.structural.decorator;

public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    private String addDressing() {
        return " + mustard";
    }

    @Override
    public String make() {
        return super.make() + addDressing();
    }
}
