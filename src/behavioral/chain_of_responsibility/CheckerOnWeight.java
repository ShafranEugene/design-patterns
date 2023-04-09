package behavioral.chain_of_responsibility;

public class CheckerOnWeight extends DogChecker {

    public CheckerOnWeight(DogChecker nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean handle(Dog dog) {
        if(dog.getWeight() < 10){
            return checkNextHandler(dog);
        }
        return false;
    }
}
