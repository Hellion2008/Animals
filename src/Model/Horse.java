package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Horse extends PackAnimal{
    public Horse() {
    }

    public Horse (String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
}
