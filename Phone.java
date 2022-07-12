package com.syntax.class24;

public abstract class Phone {

    // abstraction

    abstract void displayPictures();
    abstract void unlock();

}

class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("use the Photos app to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use FaceId to unlock the phone");
    }
}

class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Use the Gallery to display the pictures");
    }

    @Override
    void unlock() {

        System.out.println("user Finger print sensor or face unlock to unlock your phone");
    }
}

class Tester{
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.displayPictures();
    }
}





