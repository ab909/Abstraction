package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();


        Parrot parrot = new Parrot("McCaw");
        parrot.fly();
        parrot.eat();
        parrot.breathe();

    }
}
