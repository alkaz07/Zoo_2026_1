public class Rabbit {
    String name;
    String color;
    int age;
    int weight;

    public Rabbit(String color, String name, int age, int weight) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void run() {
        System.out.println("бегает");
    }

    public void jump() {
        System.out.println("прыгает");
    }

    public void eat() {
        System.out.println("кушает");
    }

    public void sleep() {
        System.out.println("спит");
    }

    public void gnaw() {
        System.out.println("грызет");
    }

    public static void main() {
        Rabbit rabbit1 = new Rabbit("Белый", "Хрум", 5, 10);
        System.out.println("Кролик: " + rabbit1.name + " Цвет: " + rabbit1.color + " Возраст: " + rabbit1.age + " Вес: " + rabbit1.weight);
    }
}


