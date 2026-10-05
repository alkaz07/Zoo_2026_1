public class Snake {
    private String color;
    private double length;
    private double age;
    private boolean isSleeping;

    public Snake(String color, double length, double age, boolean isSleeping) {
        this.color = color;
        this.length = length;
        this.age = age;
        this.isSleeping = isSleeping;
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

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping() {
        System.out.println("Змея спит");
        isSleeping = true;
    }

    public void wakeUp() {
        System.out.println("Змея проснулась");
        isSleeping = false;
    }

    public void bite() {
        System.out.println("Кусь");
    }
}
