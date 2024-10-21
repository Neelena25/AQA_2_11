import Practice_Project_10.Animal;
import Practice_Project_10.Cat;
import Practice_Project_10.Dog;

public class Main {
    public static void main(String[] args) {
        Animal Barsik = new Cat();
        Animal Sharik = new Dog();

        Barsik.Swim(34, "Barsik");
        Sharik.Swim(5, "Sharik");
    }
}