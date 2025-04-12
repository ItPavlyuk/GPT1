package G.Lesson8;

public class Fish extends Animal implements Swimmable, Eatable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public Sound makeSound() {
        return Sound.BULK;
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating");
    }

    @Override
    public void swim() {
        System.out.println("The fish is swining");
    }
    public void layEggs(){
        System.out.println("Рыба откладывает икру");
    }
}
