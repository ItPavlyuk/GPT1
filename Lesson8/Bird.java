package G.Lesson8;

public class Bird extends Animal implements Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public Sound makeSound() {
        return Sound.CHIRP;
    }

    @Override
    public void eat() {
        System.out.println("The bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }
}
