public class Leopard {
    private int age;
    private int weight;
    private final String gender;

    public Leopard(int age, int weight, String gender) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public void getOld() {
        this.age += 1;
    }

    public void hunt() {
        System.out.println("Охотится на зебру");
    }

    public void eat() {
        System.out.println("Ест зебру");
        if (this.gender.equals("Male")) {
            this.weight += 3;
        } else if (this.gender.equals("Female")) {
            this.weight += 2;
        }
    }

    public void makeSound() {
        System.out.println("Рррррррррр");
    }

    public void showInfo() {
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Пол: " + gender);
    }
}
