import Model.Animal;
import Model.AnimalCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        try {
            Scanner scanner = new Scanner(System.in);
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

    public void showMenu() throws IOException {
        String menu = "Enter number of task:\n" +
                "1 - Add new animal to registry\n" +
                "2 - Show commands of certain animal\n" +
                "3 - Train certain animal in new commands\n" +
                "4 - Show list of animals by date of birthday\n" +
                "5 - Show the total number of animals\n" +
                "0 - exit";
        System.out.println(menu);
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            int num = Integer.parseInt(reader.readLine());
            do {
                switch (num) {
                    case 1:
                        createNewAnimal();
                        break;
                    case 2:
                        System.out.println("Enter name of animal:");
                        registry.showCommandsByName(reader.readLine());
                        break;
                    case 3:
                        ;
                        break;
                    case 4:
                        registry.showAllAnimalsByBirthday();
                        break;
                    case 5:
                        System.out.println("Count of all animals: " + registry.countOfAnimals());
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("No action");
                }
                System.out.println(menu);
                System.out.println();
                num = Integer.parseInt(reader.readLine());
            } while (num != 0);
        }
    }




}
