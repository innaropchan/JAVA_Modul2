package de.telran.data;

public class Drum implements Playable {
    private String name;
    private String size;


    public Drum(String name, String size ) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println( "Plays " + this.name + " with these characteristics: size "
                + this.size);
    }


}
