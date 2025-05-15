class animal {
    void sound() {
        System.out.println("animal makes a sound");
    }
}
class Dog extends animal {
    void bark() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}