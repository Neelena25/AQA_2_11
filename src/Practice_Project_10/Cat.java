package Practice_Project_10;

public class Cat extends Animal{

    private boolean _satiety;
    private static int _catCount = 0;
    private int _amountOfFoodLimit;

    public Cat(){
        _catCount++;
        _satiety = false;
        _amountOfFoodLimit = 10;
    }

    @Override
    public void Run(int limit, String name){
        if (limit > 200){
            System.out.println("Кот не может пробежать больше 200 м");
        }
        else if (limit < 0){
            System.out.println("Недопустимое значение: " + limit);
        }
        else{
            System.out.println(name + " пробежал " + limit + " м");
        }
    }

    @Override
    public void Swim(int limit, String name){
        System.out.println("Кот не умеет плавать");
    }

    public void EatFromBowl(int foodFromBowl, Bowl bowl){
        if (_amountOfFoodLimit <= foodFromBowl){
            _satiety = true;
            bowl.DecreaseAmountOfFood(_amountOfFoodLimit);
            System.out.println("Кот сыт!");
        }
        else {
            System.out.println("Коту не хватило еды(");
        }
    }
}
