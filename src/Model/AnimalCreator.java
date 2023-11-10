package Model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class AnimalCreator {

    private Animal animal;

    public AnimalCreator(String type){
        switch (type.toLowerCase()){
            case "кошка": animal =  new Cat(); break;
            case "собака": animal = new Dog(); break;
            case "хомяк": animal = new Hamster(); break;
            case "осел": animal = new Donkey(); break;
            case "лошадь": animal = new Horse(); break;
            default: throw new IllegalArgumentException("Животное (" + type + ") нельзя добавить в реестр\n");
        }
    }

    public Animal create(){
        return animal;
    }

    public AnimalCreator setName(String name){
        animal.setName(name);
        return this;
    }

    public AnimalCreator setBirthday(LocalDateTime day){
        animal.setBirthday(day);
        return this;
    }

    public AnimalCreator setCommands(List<String> commands){
        animal.setCommands(commands);
        return this;
    }
}
