package singletonDemo;

public class AnotherSingletonDemo {
    public static void main(String[] args) {
        AnotherSingleton instance = AnotherSingleton.getInstance();
        System.out.println(instance);

        AnotherSingleton andAnotherOne = AnotherSingleton.getInstance();
        System.out.println(andAnotherOne);

       // AnotherSingleton testConstructor = new AnotherSingleton();
    }
}
