package com.snemmani.builder;

public class LunchOrderMain {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("wheat").condiments("lettuce").dressing("mayo").meat("none");

        LunchOrder order = builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());
    }
}
