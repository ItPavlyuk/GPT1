package G.Lesson8;

public class Dog extends Mammal{

    public Dog(String name) {
        super(name, 4);
    }

    @Override
    public Sound makeSound() {
        return Sound.WOOF;
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void giveBirth() {
        System.out.println("The dog gives birth");
    }
}
