package behavioral.memento;

import java.util.LinkedList;

public class Caretaker {
    private final Topic topic;
    private final LinkedList<Topic.Memento> mementos = new LinkedList<>();

    public Caretaker() {
        this.topic = new Topic();
    }

    public void printTopic(){
        System.out.println(topic.getText());
    }

    public void update(String text){
        Topic.Memento memento = topic.setNewText(text);
        mementos.add(memento);
    }

    public void restore(){
        Topic.Memento last = mementos.getLast();
        topic.setNewText(last.getText());
        mementos.removeLast();
    }
}
