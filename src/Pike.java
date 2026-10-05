public class Pike () {
    String name;
    int weight;
    int length;
    int age;

    public Pike(String name, int weight, int lenght, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.length=lenght;
    }
    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getAge(){
        return age;
    }

    public String getLenght() {
        return length;
    }

    public void setLength(int age) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("длина не может быть отрицательным параметром");
        }
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("вес не может быть отрицательным параметром");
        }
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("возраст не может быть отрицательным параметром");
        }
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Длина: " + length);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
    }

    public void makeSound() {
        System.out.println(name + " Открывает щука рот и не слышно что поёт ");
    }

}
}
