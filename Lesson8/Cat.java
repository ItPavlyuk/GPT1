package G.Lesson8;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name, 4); // У кошки 4 ноги
    }

    @Override
    public Sound makeSound() {
        return Sound.MEOW;
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void giveBirth() {
        System.out.println("The cat gives birth");
    }
}
