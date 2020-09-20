package design.patterns.java.snemmani.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;
    protected String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder stringBuilder = new StringBuilder(menuComponent.getName());
        stringBuilder.append(": ");
        stringBuilder.append(menuComponent.getUrl());
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
