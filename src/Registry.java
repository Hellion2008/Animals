import Model.Animal;

import java.time.LocalDate;
import java.util.*;

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
        for (Integer key: map.keySet()){
            System.out.println(key + ". " + map.get(key));
        }
    }

    public void showAllAnimalsByBirthday(){
        animals.sort(Comparator.comparing(Animal::getBirthday));
        for (Animal animal: animals){
            System.out.println(findKey(animal) + ". " + animal);
        }
    }

    private int findKey(Animal animal){
        int res = 0;
        Set<Map.Entry<Integer,Animal>> entrySet=map.entrySet();
        for (Map.Entry<Integer,Animal> pair : entrySet) {
            if (animal.equals(pair.getValue())) {
                res =  pair.getKey();
            }
        }
        return res;
    }

    public int countOfAnimals(){
        return animals.size();
    }

}
