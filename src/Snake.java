public class Snake {
    private String color;
    private double length;
    private double age;

    public Snake(String color, double length) {
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Не может быть такой змеи!");
        } else {
            this.length = length;
        }
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (length <= 0) {
            throw new IllegalArgumentException("Не может быть такой змеи!");
        } else {
            this.age = age;
        }
    }

    public void sleep() {
        System.out.println("Змея спит");
    }

    public void bite() {
        System.out.println("Кусь");
    }
}
