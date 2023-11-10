package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Horse extends PackAnimal{
    protected AnimalType type;
    {
        this.type = AnimalType.Horse;
    }
    public Horse() {
    }

    public Horse (String name, LocalDate birthday, List<String> commands) {
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
                "Name: " + name +
                ", birthday: " + birthday +
                ", commands: " + commands + ". ";
    }
}
