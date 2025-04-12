package G.Lesson8;

public class Cow extends Mammal{

    public Cow(String name) {
        super(name, 4);
    }

    @Override
    public Sound makeSound() {
        return Sound.MOO;
    }

    @Override
    public void eat() {
        System.out.println("The cow is eating");
    }

    @Override
    public void giveBirth() {
        System.out.println("The cow gives birth");
    }
}
