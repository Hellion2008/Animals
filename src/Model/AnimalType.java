package Model;

public enum AnimalType {
    Cat ("�����"),
    Dog ("������"),
    Donkey("����"),
    Hamster("�����"),
    Horse("������");

    private String animal;

    AnimalType(String animal) {
        this.animal = animal;
    }

}
