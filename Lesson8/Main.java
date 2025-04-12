package G.Lesson8;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Бобик");
        Cow cow = new Cow("Бурёнка");

        Zoo zoo = new Zoo();
        zoo.addAnimal(cat);
        zoo.addAnimal(dog);
        zoo.addAnimal(cow);

        zoo.feedAll();
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());

        for (Animal animal: zoo.getAnimals()){
            System.out.println(animal.getName() + " Говорит: " + animal.makeSound());
        }
    }
}
