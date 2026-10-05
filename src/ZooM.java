public class ZooM {
    static void main(String[] args) {
        System.out.println("Hello, zoo");
        testCat();
        testFox();
    }

    private static void testCat() {
        Cat cat = new Cat("Barsik", 5, 4);
        cat.sleep();
        cat.eat();
        cat.jump();
    }
    static void testFox(){
        Fox f = new Fox("Домино", 1, 5, "черно-бурый");
        f.showInfo();
        f.makeSound();
    }
}
