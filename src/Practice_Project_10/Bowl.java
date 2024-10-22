package Practice_Project_10;

public class Bowl {
    private int _amountOfFood = 0;

    public Bowl(int amountOfFood){
        _amountOfFood = amountOfFood;
    }

    public void AddFood(int food){
        if (food > 0) {
            _amountOfFood += food;
        }

        System.out.println("В миске: " + _amountOfFood);
    }

    public int GetAmountOfFood(){
        return _amountOfFood;
    }

    public void DecreaseAmountOfFood(int food){
        _amountOfFood -= food;
    }
}
