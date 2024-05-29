package singletonDemo;

public class AnotherSingleton {
//    private static AnotherSingleton instance = new AnotherSingleton();
//    private AnotherSingleton(){}//private constructor so no
//    // one can create another instance of this class
//
//    public static AnotherSingleton getInstance() {
//        return instance;
//    }//this is traditional getter for singleton can be named something else


    private static class LazyHolder{
    static final AnotherSingleton INSTANCE = new AnotherSingleton();
    }

     private AnotherSingleton(){}

     public static AnotherSingleton getInstance(){
     return LazyHolder.INSTANCE;
     }



}
