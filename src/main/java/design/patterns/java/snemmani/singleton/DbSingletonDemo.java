package design.patterns.java.snemmani.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(instance);
        System.out.println(anotherInstance);
    }
}