package de.telran.data;

public class Guitar implements Playable {
    private String name;
    private int stringsField;

    public Guitar(String name, int stringsField) {
        this.name = name;
        this.stringsField = stringsField;
    }

    public String getName() {
        return name;
    }

    public int getStringsField() {
        return stringsField;
    }

    public void setStringsField(int stringsField) {
        this.stringsField = stringsField;
    }

    @Override
    public void play() {
        System.out.println( "Plays " + this.name + " with these characteristics: stringsField "
                + this.stringsField);

    }
}
