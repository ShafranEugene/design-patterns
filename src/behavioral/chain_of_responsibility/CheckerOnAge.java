package behavioral.chain_of_responsibility;

public class CheckerOnAge extends DogChecker{
    public CheckerOnAge(DogChecker nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean handle(Dog dog) {
        if(dog.getAge() <= 3){
            return checkNextHandler(dog);
        }
        return false;
    }
}
