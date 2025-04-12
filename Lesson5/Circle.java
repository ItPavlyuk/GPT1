package G.Lesson5;

public class Circle implements Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    } //Создаем конструктор, где круг будет принимать на вход 1 параметр (радиус)

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String infoCircle() {
        double area = getArea(); // Вычисляем площадь
        double circumference = getCircumference(); // Вычисляем длину окружности

        String info = "Площадь круга: " + area + "\n" +
                "Длина окружности: " + circumference;
        return info;
    }
}
