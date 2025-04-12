package G.Lesson8;

public class Duck extends Animal implements Swimmable, Flyable, Eatable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public Sound makeSound() {
        return Sound.QUACK;
    }

    @Override
    public void eat() {
        System.out.println("The duck is eating");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swiming");
    }
}
