package Animals;

/**
 * Created by Romych on 19.02.2016.
 */
public class Dog extends Animal { //implements Swimable {
    public Dog(String name, float strength,int stamina, int courage, int speed,int jumpHeight){
        super(name,strength,stamina,courage,speed,jumpHeight);

    }
    @Override
    public void eat(int amount){
        super.eat(amount);
        time += 1;
    }
}
