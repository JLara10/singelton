package singletonDemo;

public class SingletonExample {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();//instance of runtime environment

        singletonRuntime.gc();//called garbage collector to verify it was the right runtime ?
        System.out.println(singletonRuntime);//will print the object address

        Runtime anotherInstance = Runtime.getRuntime();//another instance of object
        System.out.println(anotherInstance);//print new object instance address

        if(singletonRuntime == anotherInstance){//if both instances are equal print statement
            System.out.println("Should be the same thing");
        }
    }
}
