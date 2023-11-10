package Model;

public enum AnimalType {
    Cat ("Cat"),
    Dog ("Dog"),
    Donkey("Donkey"),
    Hamster("Hamster"),
    Horse("Horse");

    private String animal;

    AnimalType(String animal) {
        this.animal = animal;
    }

}
