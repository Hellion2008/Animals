package Model;

import java.util.ArrayList;
import java.util.List;

public interface LearningAbility<T extends Animal> {

    default T learnCommand(T animal, String command){
        List<String> newCommands = new ArrayList<>();
        for (String el: animal.getCommands()){
            newCommands.add(el);
        }
        String[] commands = command.split(" ");
        for (String el: commands){
            newCommands.add(el);
        }
        animal.setCommands(newCommands);
        return animal;
    }
}
