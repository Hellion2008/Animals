package Model;

public enum AnimalType {
    Cat ("Кошка"),
    Dog ("Собака"),
    Donkey("Осел"),
    Hamster("Хомяк"),
    Horse("Лошадь");

    private String animal;

    AnimalType(String animal) {
        this.animal = animal;
    }

}
