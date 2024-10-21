package Practice_Project_10;

public class Dog extends Animal
{
    @Override
    public void Run(int limit, String name){
        if (limit > 500){
            System.out.println("Собака не может пробежать больше 500 м");
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
        if (limit > 10){
            System.out.println("Собака не может проплыть больше 10 м");
        }
        else if (limit < 0){
            System.out.println("Недопустимое значение: " + limit);
        }
        else{
            System.out.println(name + " проплыла " + limit + " м");
        }
    }
}
