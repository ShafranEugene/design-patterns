package behavioral.chain_of_responsibility;

import java.awt.Color;

public class CheckerOnColor extends DogChecker{


    public CheckerOnColor(DogChecker nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean handle(Dog dog) {

        if(checkColor(dog.getColor())){
            return checkNextHandler(dog);
        }
        return false;
    }

    private boolean checkColor(Color color){
        if(color == Color.BLACK){
            return true;
        } else if(color == Color.GRAY){
            return true;
        } else if(color == Color.WHITE){
            return true;
        }
        return false;
    }
}
