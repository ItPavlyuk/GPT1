package GPT.lesson4;

public class Fish extends Animal {
    private String scaleColor;

    public Fish() {
    }

    public Fish(String name, String species, int age, String scaleColor) {
        super(name, species, age);
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString() {
        return "Рыба: " + "\n" +
                "Имя: " + getName() + "\n" +
                "Вид: " + getSpecies() + "\n" +
                "Возраст: " + getAge() +
                "Цвет чешуи: " + scaleColor;
    }
    @Override
    public String makeSound() {
        return "Бульк!";
    }

    class Salmon extends Fish {
        @Override
        public String toString() {
            return "Форель: " + "\n" +
                    "Имя: " + getName() + "\n" +
                    "Вид: " + getSpecies() + "\n" +
                    "Возраст: " + getAge() +
                    "Цвет чешуи: " + scaleColor;
        }
    }
}