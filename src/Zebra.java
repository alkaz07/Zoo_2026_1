public class Zebra {
    private int age;
    private int weight;
    private final String gender;
    private boolean isAlive;

    public Zebra(int age, int weight, String gender) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.isAlive = true;
    }

    public void getOld() {
        this.age += 1;
        if (age > 30) {
            die();
        }
    }

    public void die() {
        this.isAlive = false;
    }

    public void beHunted() {
        System.out.println("На зебру охотятся");
        die();
    }

    public void eat() {
        System.out.println("Зебра ест траву");
        this.weight += 1;
    }

    public void showInfo() {
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Пол: " + gender);
        System.out.println("Статус жизни: " + (isAlive ? "Живая" : "Умерла"));
    }
}
