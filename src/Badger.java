public class Badger {

    private String name;
    private int age;
    private int nutsCount;

    public Badger(String name, int age) {
        this.name = name;
        this.age = age;
        this.nutsCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void collectNut() {
        nutsCount++;
        System.out.println(name + " собрал орех.");
    }

    public int getNutsCount() {
        return nutsCount;
    }

    public void eatNut() {
        if (nutsCount > 0) {
            nutsCount--;
            System.out.println(name + " съел орех.");
        } else {
            System.out.println("У " + name + " нет орехов.");
        }
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Орехов: " + nutsCount);
    }

    public static void main(String[] args) {
        Badger badger = new Badger("Барсик", 3);

        badger.printInfo();

        badger.collectNut();
        badger.collectNut();
        badger.jump();

        System.out.println(
                "Количество орехов: " + badger.getNutsCount()
        );

        badger.eatNut();
        badger.printInfo();
    }
}
