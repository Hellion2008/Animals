package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog (String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
}
