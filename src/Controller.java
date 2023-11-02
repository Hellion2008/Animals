import Model.Animal;

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

    public void addNewAnimal(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Addition new animal...");
            System.out.println("Enter your animal:");
            scanner.nextLine();
        } catch (Exception e){
            System.out.println("Неверно введены данные!");
            System.out.println(e.getMessage());
        }
    }


}
