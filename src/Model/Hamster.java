package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Hamster extends Pet{
    public Hamster() {
    }

    public Hamster (String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    @Override
    AnimalType getAnimalType() {
        return AnimalType.Hamster;
    }

    @Override
    public String toString() {
        return getAnimalType().toString() + ". " +
                "Имя: " + name +
                ", день рождения: " + birthday +
                ", команды: " + commands + ". ";
    }
}
