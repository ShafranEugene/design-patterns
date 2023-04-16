package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        caretaker.update("1 - How not to fall in love.");
        caretaker.printTopic();

        caretaker.update("2 - How dangerous are shark.");
        caretaker.printTopic();

        caretaker.restore();
        caretaker.printTopic();

        caretaker.update("3 - How useful are apples.");
        caretaker.printTopic();

        caretaker.update("4 - Why is food getting more expensive?");
        caretaker.printTopic();

        caretaker.update("5 - Which dog to choose?");
        caretaker.printTopic();

        caretaker.restore();
        caretaker.printTopic();

        caretaker.restore();
        caretaker.printTopic();
    }
}
