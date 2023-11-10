package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Horse extends PackAnimal{
    protected AnimalType type;
    {
        this.type = AnimalType.Horse;
    }
    public Horse() {
    }

    public Horse (String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    @Override
    AnimalType getAnimalType() {
        return AnimalType.Horse;
    }

    @Override
    public String toString() {
        return getAnimalType().toString() + ". " +
                "Имя: " + name +
                ", день рождения: " + birthday +
                ", команды: " + commands + ". ";
    }
}
