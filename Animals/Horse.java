package Animals;

/**
 * Created by Romych on 19.02.2016.
 */
public class Horse extends Animal {
    public Horse(String name, float strength,int stamina, int courage, int speed,int jumpHeight){
        super(name,strength,stamina,courage,speed,jumpHeight);

    }

    @Override
    public void eat(int amount){
        super.eat(amount);
        time += 50;
    }

    @Override
    public void swim(int length, int depth){
        super.swim(length,depth);
        System.out.println("Oh, it was the horse");
    }

}
