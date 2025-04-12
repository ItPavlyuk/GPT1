package G.Lesson8;

public abstract class Mammal extends Animal {
    private int numberOfLegs;

    public Mammal(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public abstract void giveBirth();
}
