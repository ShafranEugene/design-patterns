package behavioral.chain_of_responsibility;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        DogChecker checker = createDogChecker();
        System.out.println(checker.handle(new Dog(5, Color.BLACK,2)));
        System.out.println(checker.handle(new Dog(15, Color.BLACK,3)));
        System.out.println(checker.handle(new Dog(5, Color.GREEN,3)));
        System.out.println(checker.handle(new Dog(5, Color.BLACK,10)));
    }

    private static DogChecker createDogChecker(){
        CheckerOnColor checkerOnColor = new CheckerOnColor(null);
        CheckerOnAge checkerOnAge = new CheckerOnAge(checkerOnColor);
        CheckerOnWeight checkerOnWeight = new CheckerOnWeight(checkerOnAge);
        return checkerOnWeight;
    }
}
