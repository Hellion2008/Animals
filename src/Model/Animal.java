package Model;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Animal implements LearningAbility{
    protected String name;
    protected LocalDateTime birthday;
    protected List<String> commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    abstract AnimalType getAnimalType ();

    @Override
    public List<String> learnCommand(String command) {
        getCommands().add(command);
        return getCommands();
    }
}
