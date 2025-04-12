package G.lesson4;

public class Birds extends Animal {
    protected int wingSpan;

    public Birds() {
    }

    public Birds(String name, String species, int age, int wingSpan) {
        super(name, species, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public String makeSound() {
        return "Generic birds sound";
    }

    static class Eagle extends Birds {

        @Override
        public String toString() {
            return "Орёл: " + "\n" +
                    "Имя: " + getName() + "\n" +
                    "Вид: " + getSpecies() + "\n" +
                    "Возраст: " + getAge() +
                    "Размер крыльев: " + wingSpan;
        }
        @Override
        public String makeSound() {
            return "Generic Eagle sound";
        }
    }

    static class Penguin extends Birds {

        @Override
        public String toString() {
            return "Пингвин : " + "\n" +
                    "Имя: " + getName() + "\n" +
                    "Вид: " + getSpecies() + "\n" +
                    "Возраст: " + getAge() +
                    "Размер крыльев: " + wingSpan;
        }

        @Override
        public String makeSound() {
            return "Generic penguin sound";
        }

    }

}