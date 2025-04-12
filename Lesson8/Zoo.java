package G.Lesson8;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
    // В классе Zoo создаётся "ящик" для хранения списка животных
    // И доступен только внутри класса Zoo
    private List <Animal> animals;

    // Когда создается новый зоопарк, мы создаем пустой список и помещаем его в ящик animals
    public Zoo() {
        this.animals = new ArrayList<>();
    }

    //Добавляем животное в список, который хранится в ящике "animal"
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void feed(Animal animal){
        if (animal instanceof Cat){ // Если животное экземпляр кошка
            System.out.println("Корми кошку рыбой");
        } else if (animal instanceof Dog){ // Если животное экземпляр собака
            System.out.println("Корми собаку мясом");
        } else if (animal instanceof Cow){
            System.out.println("Корми корову травой");
        } else {
            System.out.println("Неизвестный тип животного. Как кормить не знаю.");
        }
    }
    public void feedAll(){
        for (Animal animal: animals){
            feed(animal);
        }
    }
    public List<Animal> getAnimals(){
        return animals;
    }
}
