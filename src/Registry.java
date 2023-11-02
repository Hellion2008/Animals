import Model.Animal;

import java.util.List;

public class Registry<T extends Animal> {

    private static Registry registry;

    private List<T> animals;

    private Registry(){    }

    public static Registry getRegistry(){
        if (registry == null)
            registry = new Registry();
        return registry;
    }
}
