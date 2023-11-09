package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Donkey extends PackAnimal{

    protected AnimalType type;
    {
        this.type = AnimalType.Donkey;
    }
    public Donkey() {
    }

    public Donkey (String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
}
