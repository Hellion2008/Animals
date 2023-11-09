package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Hamster extends Pet{
    protected AnimalType type;
    {
        this.type = AnimalType.Hamster;
    }
    public Hamster() {
    }

    public Hamster (String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
}
