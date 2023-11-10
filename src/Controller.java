import Model.Animal;
import Model.AnimalCreator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    private Registry<Animal> registry;

    public Controller (){}

    public Controller(Registry<Animal> registry) {
        this.registry = registry;
    }

    public void setRegistry(Registry<Animal> registry) {
        this.registry = registry;
    }

    public void createNewAnimal(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Creation of new animal...");
            System.out.println("Enter type of animal:");
            AnimalCreator creator = new AnimalCreator(scanner.nextLine());
            System.out.println("Enter the name of animal:");
            creator.setName(scanner.nextLine());
            System.out.println("Enter date of animal's birthday (dd.mm.yyyy)");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ROOT);
            creator.setBirthday(LocalDate.parse(scanner.nextLine(), dtf));
            System.out.println("Enter list of commands, which animal can do:");
            creator.setCommands(List.of(scanner.nextLine().split(" ")));
            registry.addAnimalToRegistry(creator.create());
            System.out.println("Animal is added to registry");
        } catch (Exception e){
            System.out.println("Invalid data");
            System.out.println(e.getMessage());
        }
    }




}
