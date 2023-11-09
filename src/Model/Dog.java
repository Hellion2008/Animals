package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Dog extends Pet{
    protected AnimalType type;
    {
        this.type = AnimalType.Dog;
    }
    public Dog() {
    }

    public Dog (String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
}
