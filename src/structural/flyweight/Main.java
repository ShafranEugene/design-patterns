package structural.flyweight;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"HAGI-WAGI","GUGI-GYUGI","Zyabloid","Pagiloy Enot"};
        String[] colors = new String[]{"white","black","blue","red","green"};

        List<Toy> toys = new LinkedList<>();
        for(int i = 0; i < 1000; i++){
            Random random = new Random();
            String name = names[random.nextInt(4)];
            String color = colors[random.nextInt(5)];
            int height = random.nextInt(16);
            Toy toy = ToyFactory.createToy(name,color,height);
            toys.add(toy);
        }

        System.out.println("All count toys - " + toys.size());
        System.out.println("All count toys type - " + ToyFactory.getCountTypes());


    }
}
