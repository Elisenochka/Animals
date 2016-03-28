import Animals.Dog;
import Animals.Horse;
import Obstacles.Obstacle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Romych on 19.02.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException{
    //Obstacle[] obstacles = new Obstacle[];
    Scanner in = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s;
        Animals.Animal[] animals = new Animals.Animal[3];
        animals[0] = new Animals.Horse("Odya", 100, 100, 10, 50, 2);
        animals[1] = new Animals.Dog ("Orion",50,50,100,10,1);
        animals[2] = new Animals.Cat("Chaki",40,50,50,5,2);
    //ArrayList obstacles = new ArrayList();


        System.out.println("Enter an obstacle (stop - if the route is ready)");

        do{
            s=reader.readLine();

            if (s.equals("Pool")) {
                System.out.println("enter length");
                int l = Integer.parseInt(reader.readLine());
                System.out.println("enter depth");
                int d = Integer.parseInt(reader.readLine());
                for (int k = 0; k < animals.length; k++) {
                    animals[k].swim(l, d);
                    if(animals[k].strength<=0) {
                        System.out.println("You can feed(feed) animal or make him sleep (sleep) (stop for stopping route)");
                        if(reader.readLine().equals("feed")){
                            System.out.println("how much food");
                            int a = Integer.parseInt(reader.readLine());
                            animals[k].eat(a);
                        }
                        else if(reader.readLine().equals("sleep")) {
                            System.out.println("How much time");
                            int t = Integer.parseInt(reader.readLine());
                        }
                    }
                }
            }
            else if (reader.readLine().equals("Fence")){
                System.out.println("enter height");
                int h = Integer.parseInt(reader.readLine());
            }
        }while(!reader.readLine().equals("stop"));
    }


}


