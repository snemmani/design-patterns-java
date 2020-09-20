package design.patterns.java.snemmani.structural.composite;

public class MenuItem extends MenuComponent {
    @Override
    public String toString() {
        return print(this);
    }

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
