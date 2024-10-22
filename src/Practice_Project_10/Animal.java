package Practice_Project_10;

public class Animal {
    private static int _animalCount = 0;

    public Animal(){
        _animalCount++;
    }

    public void Run(int limit, String name){
    }

    public void Swim(int limit, String name){
        System.out.println(name + " пробежал " + limit + " м");
    }
}
