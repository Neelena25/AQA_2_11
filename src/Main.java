import Practice_Project_10.Animal;
import Practice_Project_10.Bowl;
import Practice_Project_10.Cat;
import Practice_Project_10.Dog;
import Practice_Project_10_2.Circle;
import Practice_Project_10_2.Rectangle;
import Practice_Project_10_2.Shape;
import Practice_Project_10_2.Triangle;

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


        Shape circle = new Circle(3, "Yellow", "Red");
        Shape rectangle = new Rectangle(3,5, "Brown", "Pink");
        Shape triangle = new Triangle(5, 2, 4, "Green", "Blue");

        System.out.println("Круг имеет площадь: " + circle.GetArea() + " периметр: " +
                circle.GetPerimeter() + " цвет фона: " + ((Circle) circle).GetFillColor() + " цвет заливки: " +
                ((Circle) circle).GetBorderColor());

        System.out.println("Треугольник имеет площадь: " + triangle.GetArea() + " периметр: " +
                triangle.GetPerimeter() + " цвет фона: " + ((Triangle) triangle).GetFillColor() + " цвет заливки: " +
                ((Triangle) triangle).GetBorderColor());

        System.out.println("Прямоугольник имеет площадь: " + rectangle.GetArea() + " периметр: " +
                rectangle.GetPerimeter() + " цвет фона: " + ((Rectangle) rectangle).GetFillColor() + " цвет заливки: " +
                ((Rectangle) rectangle).GetBorderColor());



    }
}