package Model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class AnimalCreator {

    private Animal animal;

    public AnimalCreator(String type){
        switch (type.toLowerCase()){
            case "�����": animal =  new Cat(); break;
            case "������": animal = new Dog(); break;
            case "�����": animal = new Hamster(); break;
            case "����": animal = new Donkey(); break;
            case "������": animal = new Horse(); break;
            default: throw new IllegalArgumentException("�������� (" + type + ") ������ �������� � ������\n");
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
