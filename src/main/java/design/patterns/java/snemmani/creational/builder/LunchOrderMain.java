package design.patterns.java.snemmani.creational.builder;

public class LunchOrderMain {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("wheat").condiments("lettuce").dressing("mayo").meat("none");

        LunchOrder order = builder.build();
    }
}
