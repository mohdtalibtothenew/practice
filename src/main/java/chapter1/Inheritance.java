package chapter1;

class Animal{
    void eat(){
        System.out.println("Eat");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String... args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

