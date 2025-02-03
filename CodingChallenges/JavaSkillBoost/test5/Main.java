class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {  // Fix: Changed 'extend' to 'extends'
    @Override
    void sound() {  // Fix: Changed 'voide' to 'void'
        super.sound();
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {  // Fix: Changed 'extend' to 'extends'
    @Override
    void sound() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] array) {
        // Animal a = new Animal();
        // a.sound();
        
        Dog d = new Dog();
        d.sound();
        
        
    }
}
