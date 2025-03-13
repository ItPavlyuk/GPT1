package GPT.lesson4;

public class Mammal extends Animal {
    private String furColor;
    private byte numbersOfLegs;

    public Mammal(String name, String species, int age, String furColor, byte numbersOfLegs) {
        super(name, species, age);
        this.furColor = furColor;
        this.numbersOfLegs = numbersOfLegs;
    }

    @Override
    public String toString() {
        return "Млекопитающее: " + "\n" +
                "Имя: " + getName() + "\n" +
                "Вид: " + getSpecies() + "\n" +
                "Возраст: " + getAge() +
                "Цвет шерсти: '" + furColor + '\'' +
                " Количество ног: " + numbersOfLegs;
    }

    @Override
    public String makeSound() {
        return "Generic mammal sound";
    }
}