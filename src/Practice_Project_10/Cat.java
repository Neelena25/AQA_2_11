package Practice_Project_10;

public class Cat extends Animal{
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
}
