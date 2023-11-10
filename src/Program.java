import Model.Animal;
import Model.AnimalCreator;
import Model.Cat;
import Model.Dog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//TODO: сделать меню
public class Program {
    public static void main(String[] args) {
        Animal cat = new Cat("Bublic",
                LocalDate.parse("23.12.2020", DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ROOT)),
                List.of("Fly"));
        Animal dog = new Dog("Sharik",
                LocalDate.parse("11.05.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ROOT)),
                List.of("Roll", "Sit"));
        Animal catC = new AnimalCreator("cat")
                .setName("Fluffy")
                .setBirthday(LocalDate.now())
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

//        catC.learnCommand("Jump");
//        registry.showCommandsByName(catC.getName());

//        Controller controller = new Controller();
//        controller.setRegistry(registry);
//        controller.createNewAnimal();
//
//        registry.showCommandsByName("Bob");

        registry.showAllAnimals();
        System.out.println("___________________");
        registry.showAllAnimalsByBirthday();

        System.out.println(registry.countOfAnimals());
    }
}
