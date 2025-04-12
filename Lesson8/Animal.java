package G.Lesson8;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String same) {
        this.name = same;
    }

    public abstract void eat();
    public abstract Sound makeSound();
}
