import Model.Animal;
import Model.AnimalCreator;
import Model.Cat;
import Model.Dog;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Animal cat = new Cat("Bublic", LocalDateTime.now(), List.of("Fly"));
        Animal dog = new Dog("Sharik", LocalDateTime.now(), List.of("Roll", "Sit"));
        Animal catC = new AnimalCreator("кошка")
                .setName("Fluffy")
                .setBirthday(LocalDateTime.now())
                .setCommands(List.of("Roll", "Sit"))
                .create();
//        System.out.println(cat);


        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(catC);

        for(Animal a: animals){
            System.out.println(a);
        }

        Registry<Animal> registry = Registry.getRegistry();
//        Registry<Animal> registry = new Registry<>();
//        registry.addAnimalToRegistry(catC);
        registry.addListOfAnimals(animals);
        registry.showCommandsByName(catC.getName());
        registry.showCommandsById(1);

        catC.learnCommand("Jump");
//        registry.showCommandsByName(catC.getName());


    }
}
