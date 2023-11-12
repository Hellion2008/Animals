import Model.Animal;
import Model.AnimalCreator;
import Model.Cat;
import Model.Dog;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws IOException {
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

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(catC);

        Registry<Animal> registry = Registry.getRegistry();
        registry.addListOfAnimals(animals);
        Controller controller = new Controller(registry);
        controller.showMenu();
    }
}
