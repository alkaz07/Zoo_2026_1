public class Fox {
    String name;
    String species;
    int age;
    String color;

    public Fox(String name, String species, int age, String color) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSpecies(int num) {
        switch (num) {
            case 1:
                species = "рыжая";
                break;
            case 2:
                species = "песец";
                break;
            case 3:
                species = "фенек";
                break;
            default:
                System.out.println("Такого вида нет. Выберите 1, 2 или 3.");
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть меньше 0");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Вид: " + species);
        System.out.println("Возраст: " + age);
        System.out.println("Цвет: " + color);
    }

    public void makeSound() {
        System.out.println(name + " говорит «Тяф-тяф!»");
    }

}
