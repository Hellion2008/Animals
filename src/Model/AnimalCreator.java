package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class AnimalCreator {

    private Animal animal;

    public AnimalCreator(String type){
        switch (type.toLowerCase()){
            case "cat": animal =  new Cat(); break;
            case "dog": animal = new Dog(); break;
            case "hamster": animal = new Hamster(); break;
            case "donkey": animal = new Donkey(); break;
            case "horse": animal = new Horse(); break;
            default: throw new IllegalArgumentException
                    ("Impossible to create this type (" + type + ") of animal\n");
        }
    }

    public Animal create(){
        return animal;
    }

    public AnimalCreator setName(String name){
        animal.setName(name);
        return this;
    }

    public AnimalCreator setBirthday(LocalDate day){
        animal.setBirthday(day);
        return this;
    }

    public AnimalCreator setCommands(List<String> commands){
        animal.setCommands(commands);
        return this;
    }
}
