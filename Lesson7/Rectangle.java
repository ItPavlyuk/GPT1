package G.Lesson7;

public class Rectangle extends Shape{
    private double width; // Высота
    private double height; // Ширина


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public String toString(){
        return "Прямугольник: " +  "\n" +
                "Ширина: " + getHeight() + "\n" +
                "Высота: " + getWidth() + "\n" +
                "Площадь: " + getArea() + "\n";
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}

