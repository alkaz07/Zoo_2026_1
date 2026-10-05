public class Sable {

    // Поля класса
    private String name;
    private int weight;
    private int age;
    private int ageSable;

    // Конструктор
    public Sable(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.ageSable = age * 7;
    }

    // Методы класса
    public void sayHello() {
        System.out.println("Всем привет от соболя " + name);
    }

    public void sayInfo() {
        System.out.println("Имя: " + name + ", вес: " + weight + ", возраст: " + age+ "человеческий» возраст:" + ageSable );
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getAgeSable() {
        return ageSable;
    }
        // Сеттеры с проверкой
    public void setAge ( int age){
            if (age >= 0) {
                this.age = age;
            } else {
                System.out.println("Возраст должен быть положительным");
            }
        }

    public void setWeight ( int weight){
            if (weight > 0) {
                this.weight = weight;
            } else {
                System.out.println("Вес должен быть положительным");
            }

    }
}