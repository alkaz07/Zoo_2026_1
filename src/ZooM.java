public class ZooM {
    static void main(String[] args) {
        System.out.println("Hello, zoo");
        testCat();
    }

    private static void testCat() {
        Cat cat = new Cat("Barsik", 5, 4);
        cat.sleep();
        cat.eat();
        cat.jump();
    }
}
