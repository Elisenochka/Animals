package Animals;

/**
 * Created by Romych on 19.02.2016.
 */
public class Human extends Animal {
public Human(String name, float strength,int stamina, int courage, int speed,int jumpHeight){
    super(name,strength,stamina,courage,speed,jumpHeight);

}

    @Override
    public void run(int length){
        super.run(length);
        System.out.println("Oh it was a human being");
    }

    @Override
    public void jump(int height){

    }
}
