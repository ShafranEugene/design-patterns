package behavioral.chain_of_responsibility;

public abstract class DogChecker {
    private final DogChecker nextHandler;

    public DogChecker(DogChecker nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected boolean checkNextHandler(Dog dog){
        return nextHandler == null || nextHandler.handle(dog);
    }

    public abstract boolean handle(Dog dog);
}
