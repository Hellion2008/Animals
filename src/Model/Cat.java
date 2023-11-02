package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name, LocalDateTime birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

}
