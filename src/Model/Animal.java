package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
//TODO: сделать метод обучения новым команадам
public abstract class Animal {
    protected String name;
    protected LocalDate birthday;
    protected List<String> commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    abstract AnimalType getAnimalType ();
}
