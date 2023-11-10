package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name, LocalDate birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    @Override
    AnimalType getAnimalType() {
        return AnimalType.Cat;
    }

    @Override
    public String toString() {
        return getAnimalType().toString() + ". " +
                "Name: " + name +
                ", birthday: " + birthday +
                ", commands: " + commands + ". ";
    }
}
