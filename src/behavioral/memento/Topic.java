package behavioral.memento;

public class Topic {
    private String text;

    public String getText() {
        return text;
    }

    public Memento setNewText(String text){
        Memento memento = new Memento(this.text);
        this.text = text;
        return memento;
    }


    public static class Memento{
        private final String text;

        public Memento(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
