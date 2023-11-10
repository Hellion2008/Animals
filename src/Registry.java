import Model.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Registry<T extends Animal> {

    private int id = 0;

    private HashMap<Integer, Animal> map = new HashMap<>();

    private static Registry registry;

    public List<Animal> animals = new ArrayList<>();

    private Registry(){    }
//    public Registry(){    }

    public static Registry getRegistry(){
        if (registry == null)
            registry = new Registry();
        return registry;
    }

    public void addListOfAnimals(List<Animal> list){
        for (Animal el: list){
            this.addAnimalToRegistry(el);
        }
    }

    public void addAnimalToRegistry(Animal animal){
        animals.add(animal);
        map.put(++id, animal);
    }

    public void showCommandsByName(String name){
        for (Animal el: animals){
            if (name.equals(el.getName())){
                System.out.println(el.getCommands());
                return;
            }
        }
        System.out.println("Животного с таким именем нет в реестре");
    }

    public void showCommandsById(int id){
        if (map.containsKey(id)){
            Animal el = map.get(id);
            showCommandsByName(el.getName());
            return;
        }
        System.out.println("Животного с тамким id нет в реестре");
    }

    public void showAllAnimals(){
        for (Animal animal: animals){
            System.out.println(animal);
        }
    }
    
}
