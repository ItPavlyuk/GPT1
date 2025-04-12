package G.Lesson7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Белый", 7);
        Rectangle rectangle = new Rectangle("Зеленый", 5, 7);
        Triangle triangle = new Triangle("Синий", 7, 3);

//        System.out.println(circle);
//        System.out.println(rectangle);
//        System.out.println(triangle);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        for (Shape shape: shapes){
            System.out.println("Тип: " + shape.getClass().getSimpleName() +
                    ", Цвет: " + shape.getColor() +
                    ", Площадь: " + shape.getArea());
        }
    }
}
