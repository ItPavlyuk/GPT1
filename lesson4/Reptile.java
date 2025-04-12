package G.lesson4;

public class Reptile extends Animal{
    private boolean isVenomous;

    public Reptile(String name, String species, int age, boolean isVenomous) {
        super(name, species, age);
        this.isVenomous = isVenomous;
    }

    @Override
    public String toString() {
        return "Рептилия: " +'\n' +
                "Имя: " + getName() + "\n" +
                "Вид: " + getSpecies() + "\n" +
                "Возраст: " + getAge() +
                "Ядовитый: " + isVenomous;
    }
    @Override
    public String makeSound() {
        return "Generic reptile sound";
    }
}
