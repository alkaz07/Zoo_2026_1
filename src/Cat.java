public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void run(){
        System.out.println("бегает");
    }

    public void jump(){
        System.out.println("прыгает");
    }

    public void eat(){
        System.out.println("кушает");
    }

    public void sleep(){
        System.out.println("спит");
    }

    public void showCat(){
        System.out.println("Кот " + name + " возраст " + age + " вес " + weight);
    }


    static void main() {
        Cat cat1 = new Cat("Шип", 15, 6);
        cat1.showCat();
    }
}