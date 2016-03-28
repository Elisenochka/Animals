package Animals;

/**
 * Created by Romych on 19.02.2016.
 */
public abstract class Animal {

    public String name;
    public float strength;
    public int stamina;
    public static int courage;
    public int speed;
    public int jumpHeight;
    float time =0.0f;

    public Animal() {}


    public void run(int length) {
        this.strength -= (length * (1 / this.stamina));

        this.time += (float)length/this.speed;
        System.out.println("Creature has run " + length + " kilometers" +" Time passed " + time + " Strength left " +strength);
    }
    public void jump(int height){
        this.strength -=(height*1/this.jumpHeight);

        this.time += jumpHeight/height;
        System.out.println("Creature jumped in"+" Time passed " + time + " Strength left " +strength);
    }

    public void swim(int length, int depth){
        if(depth<=courage) {
            this.strength = this.strength- (length * (1 / this.strength));
            
            time += (float)length / this.speed;
            System.out.println("Creature has swum " + length + " kilometers"+" Time passed " + time + " Strength left " +strength);
        }
        else System.out.println("Creature has frightened");
    }

    public void sleep(int hours){
        this.strength += hours;

        this.time += (float)hours;
        System.out.println("Creature has slept for " + hours + " hours");
}

    public Animal(String _name, float _strength, int _stamina, int _courage, int _speed, int _jumpHeight){
        name = _name;
        strength = _strength;
        stamina = _stamina;
        courage = _courage;
        speed = _speed;
        jumpHeight = _jumpHeight;
    }

    public void eat(int amount){
        strength+= amount;

        System.out.println("Creature has eaten ");
    }

}


