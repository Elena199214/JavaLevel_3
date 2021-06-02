package HomeWork_1.BoxFruit;

import java.util.ArrayList;
import java.util.List;

public class FruitsApp {
     public static void main(String[] args) {

         List<Apple> list = new ArrayList<>();
         Apple appleOne = new Apple();
         Apple appleTwo = new Apple();
         Apple appleThree = new Apple();
         Apple appleFour = new Apple();

         Orange orangeOne = new Orange();
         Orange orangeTwo = new Orange();
         Orange orangeThree = new Orange();

         Box<Apple> appleBoxFruit = new Box<>(appleOne,appleTwo);

     }
}
