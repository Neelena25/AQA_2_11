import Practice_Project_10.Animal;
import Practice_Project_10.Bowl;
import Practice_Project_10.Cat;
import Practice_Project_10.Dog;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Animal Barsik = new Cat();
        Animal Sharik = new Dog();

        Bowl bowl = new Bowl(27);

        Cat[] catArray = new Cat[3];

        for (int i = 0; i < catArray.length; i++){
            catArray[i] = new Cat();
            catArray[i].EatFromBowl(bowl.GetAmountOfFood(), bowl);
            System.out.println("Кот " + i + " Покушал;");
        }

        System.out.println(bowl.GetAmountOfFood());
        bowl.AddFood(67);
        System.out.println(bowl.GetAmountOfFood());


    }
}